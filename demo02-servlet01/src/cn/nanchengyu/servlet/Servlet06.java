package cn.nanchengyu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: Servlet06
 * Package: cn.nanchengyu.servlet
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/20 20:07
 * @Version 1.0
 */
@WebServlet("/Servlet06")
public class Servlet06 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //设置响应行状态码 HTTP/1.1 200  404 405 500
//        resp.setStatus(404);

    }
}
