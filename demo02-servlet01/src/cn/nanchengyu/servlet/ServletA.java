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
 *              ��Ӧ�ض���
 * @Author �ϳ���
 * @Create 2023/11/20 20:35
 * @Version 1.0
 */
@WebServlet("/servleta")
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
              //�����û�����
        System.out.println("servletaִ����");

        //��Ӧ�ض���     ������Ӧ״̬��Ϊ302 ������locateion��ӦͷΪservletB
        resp.sendRedirect("servletb");

    }
}
