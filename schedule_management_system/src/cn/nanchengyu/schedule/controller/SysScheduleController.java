package cn.nanchengyu.schedule.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

import static com.alibaba.druid.sql.visitor.SQLEvalVisitorUtils.add;

/**
 * ClassName: SysUserController
 * Package: cn.nanchengyu.schedule.controller
 * Description:
 *   做前端响应的类
 *   增加日程请求   /schedule/add
 *   删除日程请求  /schedule/remove
 *   等等
 * @Author 南城余
 * @Create 2023/11/26 1:27
 * @Version 1.0
 */
@WebServlet("/schedule/*")
public class SysScheduleController extends BaseController {
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////        String requestURI = req.getRequestURI();
////        String[] split = requestURI.split("/");
////        String methodName = split[split.length - 1];
////
//////        if (methodName.equals("add")) {
//////            add(req,resp);
//////
//////        } else if (methodName.equals("find")) {
//////              find(req,resp);
//////        } else if (methodName.equals("remove")) {
//////            remove(req,resp);
//////        } else if (methodName.equals("update")) {
//////            update(req,resp);
//////        }
////
////
//////        通过反射获取
////        Class aClass = this.getClass();
////
////        try {
////            Method declaredMethod = aClass.getDeclaredMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
////            declaredMethod.setAccessible(true);
////            declaredMethod.invoke(this, req, resp);
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
////    }
//
//
////        protected void add (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////            System.out.println("add");
////        }
////        protected void find (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////            System.out.println("find");
////        }
////        protected void remove (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////            System.out.println("remove");
////        }
////        protected void update (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////            System.out.println("update");
////        }
//
//
//
//
//
//
//    }


    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("add");
    }
}




