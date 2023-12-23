package cn.nanchengyu.tlias.filter;

import cn.nanchengyu.tlias.pojo.Result;
import cn.nanchengyu.tlias.utils.JwtUtils;
import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: LoginCheckFilter
 * Package: cn.nanchengyu.tlias.filter
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/22 22:24
 * @Version 1.0
 */
@WebFilter(urlPatterns = "/*")
public class LoginCheckFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
      //将请求和响应强装操作
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        //1. 获取请求URL
        String url = req.getRequestURL().toString();
        //2.判断请求URL中是否包含login 包含 则放行
        if (url.contains("login")){
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }
        //3.获取请求头中的令牌
        String jwt = req.getHeader("token");

        //4.判断令牌是否为空 不存在 则返回错误结果（未登录）
            if (!StringUtils.hasLength(jwt)){
                Result error = Result.error("NOT_LOGIN");
                //手动 对象转 JSON ——————》fastJSON
                String notLogin = JSONObject.toJSONString(error);
                response.getWriter().write(notLogin);
                return;
            }
        //5.解析token 如果解析失败 返回错误结果
        try {
            JwtUtils.parseJWT(jwt);
        } catch (Exception e) {
            Result error = Result.error("NOT_LOGIN");
            String notLogin = JSONObject.toJSONString(error);
            response.getWriter().write(notLogin);
            return;
        }

        //6.放行
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
