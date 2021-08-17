package com.nicole.tileslogin.service.impl;

import com.nicole.tileslogin.entity.ExcellentStudent;
import com.nicole.tileslogin.dao.ExcellentStudentDao;
import com.nicole.tileslogin.service.ExcellentStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ExcellentStudent)表服务实现类
 *
 * @author makejava
 * @since 2021-08-15 15:39:30
 */
@Service("excellentStudentService")
public class ExcellentStudentServiceImpl implements ExcellentStudentService {
    @Resource
    private ExcellentStudentDao excellentStudentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
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
        return this.excellentStudentDao.queryAllByLimit(offset, limit);
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