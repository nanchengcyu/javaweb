package cn.nanchengyu.headline.controller;

import cn.nanchengyu.headline.common.Result;
import cn.nanchengyu.headline.pojo.NewsType;
import cn.nanchengyu.headline.service.NewsTypeService;
import cn.nanchengyu.headline.service.impl.NewsTypeServiceImpl;
import cn.nanchengyu.headline.util.WebUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

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
