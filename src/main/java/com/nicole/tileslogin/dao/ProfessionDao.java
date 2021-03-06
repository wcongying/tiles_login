package com.nicole.tileslogin.dao;

import com.nicole.tileslogin.entity.Profession;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Profession)表数据库访问层
 *
 * @author makejava
 * @since 2021-08-15 15:40:58
 */
public interface ProfessionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Profession queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Profession> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param profession 实例对象
     * @return 对象列表
     */
    List<Profession> queryAll(Profession profession);

    /**
     * 新增数据
     *
     * @param profession 实例对象
     * @return 影响行数
     */
    int insert(Profession profession);

    /**
     * 修改数据
     *
     * @param profession 实例对象
     * @return 影响行数
     */
    int update(Profession profession);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<Profession> selectAll();
}