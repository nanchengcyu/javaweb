package cn.nanchengyu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * ClassName: UserServlet
 * Package: cn.nanchengyu.servlet
 * Description:
 *
 * servlet开发流程
 * 1.创建Javaweb项目，同时将tomcat添加为当前项目的依赖
 * 2.重写service方法，service（HttpServletRequest req, HttpServletResponse resp）
 * 3.在service方法中，定义业务处理代码
 * 4.在web.xml中配置Servlet对应的请求映射路径
 * @Author 南城余
 * @Create 2023/11/20 11:26
 * @Version 1.0
 */
public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        1.从request对象中获取请求中的任何信息（username参数）
        String username = request.getParameter("username");
//        2.处理业务代码
        String info = "yes";
        if("nanchengyu".equals(username)){
            info = "no";
        }
//        3.将响应的数据放入response中
        PrintWriter writer = response.getWriter();
        writer.write(info);

    }
}
