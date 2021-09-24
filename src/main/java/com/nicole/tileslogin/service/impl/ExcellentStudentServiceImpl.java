package com.nicole.tileslogin.service.impl;

import com.nicole.tileslogin.entity.ExcellentStudent;
import com.nicole.tileslogin.dao.ExcellentStudentDao;
import com.nicole.tileslogin.service.ExcellentStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (ExcellentStudent)表服务实现类
 *
 * @author makejava
 * @since 2021-08-15 15:39:30
 */
@Service("excellentStudentService")
public class ExcellentStudentServiceImpl implements ExcellentStudentService {
    @Autowired
    private ExcellentStudentDao excellentStudentDao;
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ExcellentStudent queryByIdRedis(Long id) {
        String key = "excStudentID";
        ExcellentStudent excellentStudent = null;
        boolean hasKey = redisTemplate.hasKey(key);
        if( hasKey ){
            excellentStudent = (ExcellentStudent) redisTemplate.opsForValue().get(key);
        }else{
            excellentStudent =
                    excellentStudentDao.queryById(id);
            if( null == excellentStudent ) {
                //防止为空的总是查询
                redisTemplate.opsForValue().set( key, null);
            }
            redisTemplate.opsForValue().set(key, excellentStudent);
        }
        return excellentStudent;
    }

    @Override
    public ExcellentStudent queryById(Long id) {
        return this.excellentStudentDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ExcellentStudent> queryAllByLimit(int offset, int limit) {
        String key = "studentList";
        ValueOperations<String, List<ExcellentStudent>> valueOperations = redisTemplate.opsForValue();
        List<ExcellentStudent> studentList = new ArrayList<>();
        boolean hasKey = redisTemplate.hasKey(key);
        if(hasKey){
            studentList = valueOperations.get(key);
        }else{
            studentList =
                    excellentStudentDao.queryAllByLimit( offset, limit);
            if(studentList.size() < 1) {
                valueOperations.set("studentList", null);
            }
            valueOperations.set("studentList", studentList);
        }
        return studentList;
//        return excellentStudentDao.queryAllByLimit(offset,limit);
    }

    /**
     * 新增数据
     *
     * @param excellentStudent 实例对象
     * @return 实例对象
     */
    @Override
    public ExcellentStudent insert(ExcellentStudent excellentStudent) {
        this.excellentStudentDao.insert(excellentStudent);
        return excellentStudent;
    }

    /**
     * 修改数据
     *
     * @param excellentStudent 实例对象
     * @return 实例对象
     */
    @Override
    public ExcellentStudent update(ExcellentStudent excellentStudent) {
        this.excellentStudentDao.update(excellentStudent);
        return this.queryById(excellentStudent.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.excellentStudentDao.deleteById(id) > 0;
    }
}