package cn.nanchengyu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: ServletB
 * Package: cn.nanchengyu.servlet
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/20 20:35
 * @Version 1.0
 */
@WebServlet("/servletb")
public class ServletB extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servletb执行了");
    }
}
