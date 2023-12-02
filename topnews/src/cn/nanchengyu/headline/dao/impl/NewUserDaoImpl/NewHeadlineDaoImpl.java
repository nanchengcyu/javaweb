package cn.nanchengyu.headline.dao.impl.NewUserDaoImpl;

import cn.nanchengyu.headline.dao.BaseDao;
import cn.nanchengyu.headline.dao.NewsHeadlineDao;
import cn.nanchengyu.headline.dao.NewsUserDao;
import cn.nanchengyu.headline.pojo.vo.HeadlineDetailVo;
import cn.nanchengyu.headline.pojo.vo.HeadlineQueryVo;

import java.util.List;

/**
 * ClassName: NewUserDaoImpl
 * Package: cn.nanchengyu.headline.dao.impl.NewUserDaoImpl
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/30 23:05
 * @Version 1.0
 */
public class NewHeadlineDaoImpl extends BaseDao implements NewsHeadlineDao {
    @Override
    public int findPageCount(HeadlineQueryVo headlineQueryVO) {
        return 0;
    }

    @Override
    public List<HeadlineQueryVo> findPageList(NewsHeadlineDao headlineDao) {
        return null;
    }

    @Override
    public void incrPageViews(int hid) {

    }

    @Override
    public HeadlineDetailVo findHeadlineDetail(int hid) {
        return null;
    }
}
