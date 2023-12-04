package com.example.boot3.redis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class Boot3RedisApplicationTests {

    @Autowired
    RedisTemplate redisTemplate ;
    @Test
    void contextLoads() {
    }

    @Test
    void testList(){
        String listName = "listtest";
        redisTemplate.opsForList().leftPush("listName","1");
        redisTemplate.opsForList().leftPush("listName","2");
        redisTemplate.opsForList().leftPush("listName","3");

//       String pop = redisTemplate.opsForList().leftPop(listName);
//        Assertions.assertEquals("3",pop);


    }
    @Test
    void testSet(){
        String setName = "settest";
        redisTemplate.opsForSet().add(setName,"1","2","3","4");

        Boolean aBoolean = redisTemplate.opsForSet().isMember(setName, "2");
        Assertions.assertTrue(aBoolean);

        Boolean aBoolean1 = redisTemplate.opsForSet().isMember(setName, "5");
        Assertions.assertFalse(aBoolean1);

    }
}
