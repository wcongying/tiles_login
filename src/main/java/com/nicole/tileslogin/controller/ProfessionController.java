package com.nicole.tileslogin.controller;

import com.nicole.tileslogin.entity.Profession;
import com.nicole.tileslogin.service.ProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * (Profession)表控制层
 *
 * @author makejava
 * @since 2021-08-15 15:40:58
 */
@Controller
@RequestMapping("/u/profession")
public class ProfessionController {
    /**
     * 服务对象
     */
    @Autowired
    private ProfessionService professionService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String profession(Map<String,Object> map, HttpServletRequest request){

        List<Profession> professionList = professionService.queryAll();
        map.put("profession",professionList);
        return "profession";
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Profession selectOne(Long id) {
        return this.professionService.queryById(id);
    }

}