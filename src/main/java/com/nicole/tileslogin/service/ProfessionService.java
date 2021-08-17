package com.nicole.tileslogin.service;

import com.nicole.tileslogin.entity.Profession;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Profession)表服务接口
 *
 * @author makejava
 * @since 2021-08-15 15:40:58
 */
@Service
public interface ProfessionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Profession queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Profession> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param profession 实例对象
     * @return 实例对象
     */
    Profession insert(Profession profession);

    /**
     * 修改数据
     *
     * @param profession 实例对象
     * @return 实例对象
     */
    Profession update(Profession profession);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    List<Profession> queryAll();
}