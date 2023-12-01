package cn.nanchengyu.headline.dao.impl.NewUserDaoImpl;

import cn.nanchengyu.headline.dao.BaseDao;
import cn.nanchengyu.headline.dao.NewsTypeDao;
import cn.nanchengyu.headline.dao.NewsUserDao;
import cn.nanchengyu.headline.pojo.NewsType;

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
public class NewTypeDaoImpl extends BaseDao implements NewsTypeDao {
    @Override
    public List<NewsType> findAll() {
        String sql = "select tid,tname from news_type";
        return baseQuery(NewsType.class,sql);
    }
}
