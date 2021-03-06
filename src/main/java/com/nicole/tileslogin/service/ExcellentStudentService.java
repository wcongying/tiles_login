package com.nicole.tileslogin.service;

import com.nicole.tileslogin.entity.ExcellentStudent;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (ExcellentStudent)表服务接口
 *
 * @author makejava
 * @since 2021-08-15 15:39:29
 */
@Service
public interface ExcellentStudentService {
    /**
     * 通过ID查询单条数据带redis
     *
     * @param id 主键
     * @return 实例对象
     */
    ExcellentStudent queryByIdRedis(Long id) ;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ExcellentStudent queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ExcellentStudent> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param excellentStudent 实例对象
     * @return 实例对象
     */
    ExcellentStudent insert(ExcellentStudent excellentStudent);

    /**
     * 修改数据
     *
     * @param excellentStudent 实例对象
     * @return 实例对象
     */
    ExcellentStudent update(ExcellentStudent excellentStudent);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}