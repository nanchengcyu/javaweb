package cn.nanchengyu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * ClassName: Servlet04
 * Package: cn.nanchengyu.servlet
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/20 19:17
 * @Version 1.0
 */
@WebServlet("/servlet04")
public class Servlet04 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //行相关API
//        String method = req.getMethod();
//        System.out.println(method);
        System.out.println(req.getMethod());//获取请求方式  get post delete
        System.out.println(req.getScheme());//获取请求协议  http
        System.out.println(req.getProtocol());//获取协议及版本号
        System.out.println(req.getRequestURI());   //获取请求的uri 项目内的资源路径
        System.out.println(req.getRequestURL());   //获取请求的url 项目内的资源完整路径

        System.out.println("-------------------------------------");
//获取本次请求中所有的请求头名字
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String hname = headerNames.nextElement();
            System.out.println(hname+":"+req.getHeader(hname));
        }

    }
}
