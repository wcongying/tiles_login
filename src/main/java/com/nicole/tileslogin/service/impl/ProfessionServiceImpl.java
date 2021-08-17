package com.nicole.tileslogin.service.impl;

import com.nicole.tileslogin.entity.Profession;
import com.nicole.tileslogin.dao.ProfessionDao;
import com.nicole.tileslogin.service.ProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Profession)表服务实现类
 *
 * @author makejava
 * @since 2021-08-15 15:40:58
 */
@Service("professionService")
public class ProfessionServiceImpl implements ProfessionService {
    @Autowired
    private ProfessionDao professionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Profession queryById(Long id) {
        return this.professionDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Profession> queryAllByLimit(int offset, int limit) {
        return this.professionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param profession 实例对象
     * @return 实例对象
     */
    @Override
    public Profession insert(Profession profession) {
        this.professionDao.insert(profession);
        return profession;
    }

    /**
     * 修改数据
     *
     * @param profession 实例对象
     * @return 实例对象
     */
    @Override
    public Profession update(Profession profession) {
        this.professionDao.update(profession);
        return this.queryById(profession.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.professionDao.deleteById(id) > 0;
    }

    @Override
    public List<Profession> queryAll() {
        return this.professionDao.selectAll();
    }
}