package cn.nanchengyu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: ServleA
 * Package: cn.nanchengyu.servlet
 * Description:
 *              响应重定向
 * @Author 南城余
 * @Create 2023/11/20 20:35
 * @Version 1.0
 */
@WebServlet("/servleta")
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
              //接受用户请求
        System.out.println("servleta执行了");

        //响应重定向     设置响应状态码为302 且设置locateion响应头为servletB
        resp.sendRedirect("servletb");

    }
}
