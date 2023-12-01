package cn.nanchengyu.schedule.controller;

import cn.nanchengyu.schedule.pojo.SysUser;
import cn.nanchengyu.schedule.service.SysUserService;
import cn.nanchengyu.schedule.service.impl.SysUserServiceImpl;
import cn.nanchengyu.schedule.util.MD5Util;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: SysUserController
 * Package: cn.nanchengyu.schedule.controller
 * Description:
 *    controller层处理与前端的交互，登录注册的话看 from表单的action的路径 根据路径写这个类的方法
 * @Author 南城余
 * @Create 2023/11/26 1:27
 * @Version 1.0
 */
@WebServlet("/user/*")
public class SysUserController extends BaseController {
    private SysUserService userService = new SysUserServiceImpl();

    protected void regist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1 接收客户端提交的参数
        String username = req.getParameter("username");
        String userPwd = req.getParameter("userPwd");
        //2.调用服务层方法，完成注册
        SysUser sysUser = new SysUser(null, "username", "userPwd");
        int rows = userService.regist(sysUser);
        if (rows > 0) {
            resp.sendRedirect("/registSuccess.html");
        } else {
            resp.sendRedirect("/registFail.html");
        }
    }


    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.接受用户名和密码
        String username = req.getParameter("username");
        String userPwd = req.getParameter("userPwd");

        //2.调用服务层方法，根据用户名查询用户信息
       SysUser loginUser = userService.findByUsername(username);
       if (null==loginUser){
           resp.sendRedirect("/loginUsernameError.html");
       } else if (!MD5Util.encrypt(userPwd).equals(loginUser.getUserPwd())){
           //3.判断密码是否匹配
           //跳转到密码有误提示页
           resp.sendRedirect("/loginUserPwdError.html");
       }else{
           //4.跳转到首页
           resp.sendRedirect("showSchedule.html");

       }
    }
}
