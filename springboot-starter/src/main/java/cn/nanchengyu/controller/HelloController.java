package cn.nanchengyu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: HelloController
 * Package: cn.nanchengyu.controller
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/16 18:49
 * @Version 1.0
 */
@RestController
public class HelloController {

     @RequestMapping("/hello")
        public String hello(){
            System.out.println("Hello my name is ncy");
            return "Hello my name is ncy";
        }
}
