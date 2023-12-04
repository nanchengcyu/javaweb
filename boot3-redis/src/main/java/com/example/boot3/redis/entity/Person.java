package com.example.boot3.redis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName: Person
 * Package: com.example.boot3.redis.entity
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/4 17:08
 * @Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person implements Serializable {
    private Long id;
    private String name;
    private Integer age;
//    private Data  brithDay;
}
