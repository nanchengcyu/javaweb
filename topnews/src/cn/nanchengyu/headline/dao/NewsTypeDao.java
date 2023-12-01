package cn.nanchengyu.headline.dao;

import cn.nanchengyu.headline.pojo.NewsType;

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
public interface NewsTypeDao {
    List<NewsType> findAll();
}
