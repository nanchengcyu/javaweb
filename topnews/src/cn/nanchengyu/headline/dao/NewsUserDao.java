package cn.nanchengyu.headline.dao;

import cn.nanchengyu.headline.pojo.NewsUser;

/**
 * ClassName: NewsHeadlineDao
 * Package: cn.nanchengyu.headline.dao
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/30 23:03
 * @Version 1.0
 */
public interface NewsUserDao {
    /**
     *
     * @param username
     * @return
     */
    NewsUser findByUsername(String username);

    NewsUser findByUid(Integer userId);

    Integer insertUser(NewsUser registUser);
}
