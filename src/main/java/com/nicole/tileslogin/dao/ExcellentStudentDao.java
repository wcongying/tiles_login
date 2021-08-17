package com.nicole.tileslogin.dao;

import com.nicole.tileslogin.entity.ExcellentStudent;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (ExcellentStudent)表数据库访问层
 *
 * @author makejava
 * @since 2021-08-15 15:39:28
 */
public interface ExcellentStudentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ExcellentStudent queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ExcellentStudent> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param excellentStudent 实例对象
     * @return 对象列表
     */
    List<ExcellentStudent> queryAll(ExcellentStudent excellentStudent);

    /**
     * 新增数据
     *
     * @param excellentStudent 实例对象
     * @return 影响行数
     */
    int insert(ExcellentStudent excellentStudent);

    /**
     * 修改数据
     *
     * @param excellentStudent 实例对象
     * @return 影响行数
     */
    int update(ExcellentStudent excellentStudent);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}