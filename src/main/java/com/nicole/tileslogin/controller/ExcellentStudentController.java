package com.nicole.tileslogin.controller;

import com.nicole.tileslogin.entity.ExcellentStudent;
import com.nicole.tileslogin.rest.Restful;
import com.nicole.tileslogin.service.ExcellentStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * (ExcellentStudent)表控制层
 *
 * @author makejava
 * @since 2021-08-15 15:39:31
 */
@Controller
@RequestMapping("/excellentStudent")
public class ExcellentStudentController {
    /**
     * 服务对象
     */
    @Autowired
    private ExcellentStudentService excellentStudentService;

    @RequestMapping(value = "/idjsonredis", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> excellentStudentIDJsonRedis(){
        long id = 1L;
        ExcellentStudent excellentStudent = excellentStudentService.queryByIdRedis( id );
        if (null != excellentStudent) {
            return Restful.set(400, "find exc stu successfully",excellentStudent );
        } else {
            return Restful.set(200, "find exc stu error", excellentStudent);
        }

    }

    @RequestMapping(value = "/idbyjson", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> excellentStudentIDJson(){
        long id = 1L;
        ExcellentStudent excellentStudent = excellentStudentService.queryById( id );
        if (null != excellentStudent) {
            return Restful.set(400, "find exc stu successfully",excellentStudent );
        } else {
            return Restful.set(200, "find exc stu error", excellentStudent);
        }

    }

    @RequestMapping(value = "/salarydescredis", method = RequestMethod.GET)
    public String salaryDesc(Map<String,Object> map){
        //只看前4个记录,且按工资高低排序
        int offset = 0;
        int limit = 4;
        List<ExcellentStudent> studentList =
                excellentStudentService.queryAllByLimit( offset, limit);
        map.put("excelStu",studentList);
        return "excellentStudent";
    }

    @RequestMapping(value = "/salarydescjsonredis", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> excellentStudentJson(){
        int offset = 0;
        int limit = 4;
        List<ExcellentStudent> studentList = excellentStudentService.queryAllByLimit( offset, limit);
        if (null == studentList) {
            return Restful.set(400, "find exc stu successfully" ,studentList);
        } else {
            return Restful.set(200, "find exc stu error", studentList);
        }
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ExcellentStudent selectOne(Long id) {
        return this.excellentStudentService.queryById(id);
    }

}