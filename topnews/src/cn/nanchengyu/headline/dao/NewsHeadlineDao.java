package cn.nanchengyu.headline.dao;

import cn.nanchengyu.headline.pojo.vo.HeadlineDetailVo;
import cn.nanchengyu.headline.pojo.vo.HeadlinePageVo;
import cn.nanchengyu.headline.pojo.vo.HeadlineQueryVo;

import java.util.List;

/**
 * ClassName: NewsHeadlineDao
 * Package: cn.nanchengyu.headline.dao
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/30 23:03
 * @Version 1.0
 */
public interface NewsHeadlineDao {
    int findPageCount(HeadlineQueryVo headlineQueryVO);


    List<HeadlineQueryVo> findPageList(NewsHeadlineDao headlineDao);

    void incrPageViews(int hid);

    HeadlineDetailVo findHeadlineDetail(int hid);
}
