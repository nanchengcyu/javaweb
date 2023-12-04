package com.example.boot3.redis.controller;

import com.example.boot3.redis.entity.Person;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




/**
 * ClassName: RedisTestController
 * Package: com.example.boot3.redis.controller
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/4 16:11
 * @Version 1.0
 */
@RestController
@Data
public class RedisTestController  {

    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    RedisTemplate<Object,Object> redisTemplate;
//    @GetMapping("/count")
//    public String count(){
//
//        Long hello = StringRedisTemplate.opsForValue().increment("hello");
//
//        return "访问了["+hello+"]";
//    }
    @GetMapping("/person/save")
    public String savePerson(){
        Person person = new Person(1L, "nanchengyu", 18);

        //1.序列化对象转为字符串方式
        redisTemplate.opsForValue().set("person",person);
        return  "ok";
    }
    @GetMapping("/person/get")
    public Person person(){
        Person person = (Person) redisTemplate.opsForValue().get("person");
        return person;

    }
}
