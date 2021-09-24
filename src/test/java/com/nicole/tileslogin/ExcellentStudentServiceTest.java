package com.nicole.tileslogin;

import com.nicole.tileslogin.entity.ExcellentStudent;
import com.nicole.tileslogin.service.ExcellentStudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class ExcellentStudentServiceTest {
    @Autowired
    private ExcellentStudentService excellentStudentService;

    @Test
    @Transactional
    @Rollback(true)
    public void salaryDescTest(){
        //只看前4个记录
        int offset = 0;
        int limit = 4;
        List<ExcellentStudent> studentList =
                excellentStudentService.queryAllByLimit( offset, limit);
        System.out.println( studentList.get(0).getName());
    }
}
