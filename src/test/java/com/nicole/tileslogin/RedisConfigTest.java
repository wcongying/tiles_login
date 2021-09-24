package com.nicole.tileslogin;

import com.nicole.tileslogin.config.RedisConfig;
import com.nicole.tileslogin.entity.ExcellentStudent;
import com.nicole.tileslogin.service.ExcellentStudentService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class RedisConfigTest {
    @Autowired
    private ExcellentStudentService excellentStudentService;
    @Autowired
    private RedisTemplate redisTemplate;

//    private ListOperations<String, List<ExcellentStudent>> opsForList;

    private ValueOperations<String, List<ExcellentStudent>> valueOperations;

    @Before
    public void setUp() throws Exception{
//        opsForList = redisTemplate.opsForList();
        valueOperations = redisTemplate.opsForValue();
    }

    @Test
    @Transactional
    @Rollback(true)
    public void getExcStudentsTest(){
        //只看前4个记录
        int offset = 0;
        int limit = 4;
        String key = "studentList";
        List<ExcellentStudent> studentList = new ArrayList<>();
        boolean hasKey = redisTemplate.hasKey(key);
        if(hasKey){
            studentList = valueOperations.get(key);
            int size = studentList.size();
            for (int i = 0; i < size; i++) {
                System.out.println("从缓存中获取数据:"+ studentList.get(i).getName());
            }

            System.out.println("-----------------------------");
        }else{
            studentList =
                    excellentStudentService.queryAllByLimit( offset, limit);
            System.out.println("查询数据库获取数据:"+studentList.get(0).getName());
            valueOperations.set("studentList", studentList);
            System.out.println("------------写入缓存---------------------");
        }
    }

}
