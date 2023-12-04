package cn.nanchengyu.headline.service.impl;

import cn.nanchengyu.headline.dao.NewsHeadlineDao;
import cn.nanchengyu.headline.dao.impl.NewUserDaoImpl.NewHeadlineDaoImpl;
import cn.nanchengyu.headline.pojo.vo.HeadlineDetailVo;
import cn.nanchengyu.headline.pojo.vo.HeadlineQueryVo;
import cn.nanchengyu.headline.service.NewsHeadlineService;
import cn.nanchengyu.headline.service.NewsTypeService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: newUserService
 * Package: cn.nanchengyu.headline.service
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/30 23:08
 * @Version 1.0
 */
public class NewsHeadlineServiceImpl implements NewsHeadlineService {

    private NewsHeadlineDao headlineDao = new NewHeadlineDaoImpl();
    @Override

    public Map findPage(HeadlineQueryVo headlineQueryVO) {
       int pageNum = headlineQueryVO.getPageNum();
       int pageSize = headlineQueryVO.getPageSize();
        List<HeadlineQueryVo> pageData = headlineDao.findPageList(headlineDao);
        int totalSize = headlineDao.findPageCount(headlineQueryVO);
        int totalPage = totalSize % pageSize == 0 ? totalSize / pageSize : totalSize / pageSize + 1;

        Map pageInfo = new HashMap();
        pageInfo.put("pageNum", pageNum);
        pageInfo.put("pageSize",pageSize);
        pageInfo.put("totalPage", totalPage);
        pageInfo.put("totalSize", totalSize);
        pageInfo.put("pageData", pageData);

        return pageInfo;
    }

    @Override
    public HeadlineDetailVo findHeadlineDetail(int hid) {

        //修改该头条的浏览量+1
        headlineDao.incrPageViews(hid);
        //查询头条详情
        return  headlineDao.findHeadlineDetail(hid);
    }

    @Override
    public int removeByHid(int hid) {
        return headlineDao.removeByHid(hid);
    }
}
