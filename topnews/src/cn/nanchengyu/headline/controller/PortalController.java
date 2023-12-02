package cn.nanchengyu.headline.controller;

import cn.nanchengyu.headline.common.Result;
import cn.nanchengyu.headline.pojo.NewsHeadline;
import cn.nanchengyu.headline.pojo.NewsType;
import cn.nanchengyu.headline.pojo.vo.HeadlineDetailVo;
import cn.nanchengyu.headline.pojo.vo.HeadlineQueryVo;
import cn.nanchengyu.headline.service.NewsHeadlineService;
import cn.nanchengyu.headline.service.NewsTypeService;
import cn.nanchengyu.headline.service.impl.NewsHeadlineServiceImpl;
import cn.nanchengyu.headline.service.impl.NewsTypeServiceImpl;
import cn.nanchengyu.headline.util.WebUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: NewsHeadlineController
 * Package: cn.nanchengyu.headline.controller
 * Description:
 *门户 控制器
 * 那些不需要登录，不需要做增删改查的门户页的请求都放在这里
 * @Author 南城余
 * @Create 2023/11/30 23:15
 * @Version 1.0
 */

@WebServlet("/portal/*")
public class PortalController extends BaseController {
    private NewsTypeService typeService = new NewsTypeServiceImpl();
    private NewsHeadlineService headlineService = new NewsHeadlineServiceImpl();

    protected void showHeadlineDetail(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收要查询头条的hid
        int hid = Integer.parseInt(req.getParameter("hid"));
        //调用服务层完成查询处理
        HeadlineDetailVo headlineDetailVo = headlineService.findHeadlineDetail(hid);

        //将查询的信息响应给客户端
        Map data = new HashMap();
        data.put("headlineDetailVo", headlineDetailVo);
        WebUtil.writeJson(resp, Result.ok(data));
    }

    /**
     * 分页查询头条信息
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */

    protected void findNewsPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收请求中的参数
        HeadlineQueryVo headlineQueryVO = WebUtil.readJson(req, HeadlineQueryVo.class);
        //调用业务层方法，查询头条信息

        Map pageInfo = headlineService.findPage(headlineQueryVO);
        Map data = new HashMap();
        data.put("pageInfo", pageInfo);
        //将查询到的头条信息，响应给客户端
        WebUtil.writeJson(resp, Result.ok(data));
    }

    /**
     *  查询所有头条类型的业务接口实现
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void findAllTypes(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //查询所有的新闻类型，装入Result响应给客户端
        List<NewsType> newsTypeList = typeService.findAll();
        WebUtil.writeJson(resp,Result.ok(newsTypeList));
    }
}
