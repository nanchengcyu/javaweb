package cn.nanchengyu.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import cn.nanchengyu.pojo.User;

import java.time.LocalDateTime;
import java.util.Arrays;


/**
 * ClassName: RequestController
 * Package: cn.nanchengyu.controller
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/16 20:05
 * @Version 1.0
 */
@RestController
public class RequestController {
//    @RequestMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest request) {
//
//        //获取请求参数
//        String username = request.getParameter("username");
//        String age = request.getParameter("age");
////        Integer i = Integer.valueOf(age);
////            数据转换
//        int i = Integer.parseInt(age);
//        System.out.println(username+i);
//        return "OK";
//    }
    //方法2：简单的方式
    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam(name="ncyname") String username, Integer age) {

        //获取请求参数
//        String username = request.getParameter("username");
//        String age = request.getParameter("age");
//        Integer i = Integer.valueOf(age);
//            数据转换
//        int i = Integer.parseInt(age);
        System.out.println(username+age);
        return "OK";
    }

    //实体类传参简单
    @RequestMapping("/simplePojo")
    public String simplePojo(User user) {
        System.out.println(user);
        return "OK";
    }
    //复杂
    @RequestMapping("/complexPojo")
    public String complexPojo(User user) {
        System.out.println(user);
        return "OK";
    }
    //数组传参

    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby) {
        System.out.println(Arrays.toString(hobby));
        return "OK";
    }

    //日期时间传参
    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime) {
        System.out.println(updateTime);
        return "OK";
    }
    //json参数
    @RequestMapping("jsonParam")
    public String jsonParam(@RequestBody User user) {

        System.out.println(user);
        return "ok";

    }

    //path传参
    @RequestMapping("/path/{id}")
    public String pathParam(@PathVariable Integer id){
        System.out.println(id);
        return "OK";
    }
}
