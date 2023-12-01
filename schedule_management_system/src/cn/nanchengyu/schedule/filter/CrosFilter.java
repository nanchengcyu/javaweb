package cn.nanchengyu.schedule.filter;

/**
 * ClassName: CrosFilter
 * Package: cn.nanchengyu.schedule.filter
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/26 20:14
 * @Version 1.0
 */



import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Filter;

//@WebFilter("/*")
//public class CrosFilter implements Filter {
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//
//        HttpServletRequest request = (HttpServletRequest) servletRequest;
//        System.out.println(request.getMethod());
//        HttpServletResponse response = (HttpServletResponse) servletResponse;
//        response.setHeader("Access-Control-Allow-Origin", "*");
//        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT,OPTIONS, DELETE, HEAD");
//        response.setHeader("Access-Control-Max-Age", "3600");
//        response.setHeader("Access-Control-Allow-Headers", "access-control-allow-origin, authority, content-type, version-info, X-Requested-With");
//        // 如果是跨域预检请求,则直接在此响应200业务码
//        if(request.getMethod().equalsIgnoreCase("OPTIONS")){
//            WebUtil.writeJson(response, Result.ok(null));
//        }else{
//            // 非预检请求,放行即可
//            filterChain.doFilter(servletRequest, servletResponse);
//        }
//    }
//}