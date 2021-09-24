package com.nicole.tileslogin;

import com.nicole.tileslogin.entity.Profession;
import com.nicole.tileslogin.service.ProfessionService;
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
public class ProfessionServiceTest {
    @Autowired
    private ProfessionService professionService;
    @Test
    @Transactional
    @Rollback(true)
    public void queryAllTest(){
        List<Profession> profs = professionService.queryAll();
        System.out.println( profs.get(0).getDescription());
    }

}
