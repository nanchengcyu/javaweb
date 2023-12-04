package cn.nanchengyu.headline.controller;

import cn.nanchengyu.headline.common.Result;
import cn.nanchengyu.headline.service.NewsHeadlineService;
import cn.nanchengyu.headline.service.impl.NewsHeadlineServiceImpl;
import cn.nanchengyu.headline.util.WebUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: NewsHeadlineController
 * Package: cn.nanchengyu.headline.controller
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/30 23:15
 * @Version 1.0
 */

@WebServlet("/headline/*")
public class NewsHeadlineController extends BaseController  {

    private NewsHeadlineService headlineService = new NewsHeadlineServiceImpl();
    protected void removeByHid(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int hid = Integer.parseInt(req.getParameter("hid"));

        headlineService.removeByHid(hid);
        WebUtil.writeJson(resp, Result.ok(null));
    }
}
