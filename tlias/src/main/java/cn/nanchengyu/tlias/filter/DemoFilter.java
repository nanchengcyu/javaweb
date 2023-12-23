package cn.nanchengyu.tlias.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * ClassName: DemoFilter
 * Package: cn.nanchengyu.tlias.filter
 * Description:
 *       此方法中，init和destroy的方法默认为已有，无需重写
 *       并且此拦截处理还需要在类前加@WebFilter(urlPatterns = "/*")
 *       还需要在main方法中添加@ServletComponentScan注解
 * @Author 南城余
 * @Create 2023/12/22 21:54
 * @Version 1.0
 */
//@WebFilter(urlPatterns = "/*")
public class DemoFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init方法执行了");
    }

    @Override//此方法会执行多次，每次调用一次后端请求，就会执行一次
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("DemoFilter doFilter");
        //放行操作
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("destroy方法执行了");
    }
}
