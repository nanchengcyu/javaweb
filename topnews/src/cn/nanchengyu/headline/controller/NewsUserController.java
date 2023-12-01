package cn.nanchengyu.headline.controller;

import cn.nanchengyu.headline.common.Result;
import cn.nanchengyu.headline.common.ResultCodeEnum;
import cn.nanchengyu.headline.pojo.NewsUser;
import cn.nanchengyu.headline.service.NewsUserService;
import cn.nanchengyu.headline.service.impl.NewsUserServiceImpl;
import cn.nanchengyu.headline.util.JwtHelper;
import cn.nanchengyu.headline.util.MD5Util;
import cn.nanchengyu.headline.util.WebUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: NewsHeadlineController
 * Package: cn.nanchengyu.headline.controller
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/30 23:15
 * @Version 1.0
 */

@WebServlet("/user/*")
public class NewsUserController extends BaseController {
    private NewsUserService userService = new NewsUserServiceImpl();

    /**
     * 根据token口令获取用户信息的接口实现
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求中的token口令
        String token = req.getHeader("token");
        Result result = Result.build(null, ResultCodeEnum.NOTLOGIN);
        if(null != token && (!"".equals(token))){
            if (!JwtHelper.isExpiration(token)){
                Integer userId = JwtHelper.getUserId(token).intValue();
               NewsUser newsUser = userService.findByUid(userId);
               if (null != newsUser){
                   Map data = new HashMap();
                   newsUser.setUserPwd("");
                   data.put("loginUser",newsUser);
                   result = Result.ok(data);
               }
            }
        }
        WebUtil.writeJson(resp, result);
    }

    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接受用户名和密码
        NewsUser paramUser = WebUtil.readJson(req, NewsUser.class);


        //调用服务层方法 实现登录
    NewsUser loginUser =   userService.findByUsername(paramUser.getUsername());
    Result result = null;
    if(null != loginUser){
        if (MD5Util.encrypt(paramUser.getUserPwd()).equalsIgnoreCase(loginUser.getUserPwd())){
            Integer uid = loginUser.getUid();
            String token = JwtHelper.createToken(uid.longValue());
            Map data = new HashMap();
            data.put("token", token);
            result = Result.ok(data);
        }else {
            result = Result.build(null, ResultCodeEnum.PASSWORD_ERROR);
        }
    }else {
        result = Result.build(null, ResultCodeEnum.USERNAME_ERROR);
    }


        //向客户端响应登录验证信息
        WebUtil.writeJson(resp, result);

    }
}
