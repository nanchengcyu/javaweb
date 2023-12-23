package cn.nanchengyu.tlias.controller;

import cn.nanchengyu.tlias.pojo.Emp;
import cn.nanchengyu.tlias.pojo.Result;
import cn.nanchengyu.tlias.service.EmpService;
import cn.nanchengyu.tlias.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


/**
 * ClassName: LoginController
 * Package: cn.nanchengyu.tlias.controller
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/22 20:18
 * @Version 1.0
 */
@Slf4j
@RestController
public class LoginController {
    @Autowired
    private EmpService empService;
        @PostMapping("/login")
    public Result login(@RequestBody Emp emp){
            log.info("员工登录：{}",emp);
           Emp e =   empService.login(emp);
           //引入JWT校验登录
            if (e != null){
                HashMap<String, Object> claims = new HashMap<>();
                //放入要加密的对象
                claims.put("id",e.getId());
                claims.put("name",e.getName());
                claims.put("username",e.getUsername());
                String jwt = JwtUtils.generateJwt(claims); //jwt包含了当前登录的员工信息
                //返回jwt
                return Result.success(jwt);
            }
        return Result.error("登录失败");
        }
}
