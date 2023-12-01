package cn.nanchengyu.headline.service.impl;

import cn.nanchengyu.headline.dao.NewsUserDao;
import cn.nanchengyu.headline.dao.impl.NewUserDaoImpl.NewUserDaoImpl;
import cn.nanchengyu.headline.pojo.NewsUser;
import cn.nanchengyu.headline.service.NewsUserService;

/**
 * ClassName: newUserService
 * Package: cn.nanchengyu.headline.service
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/30 23:08
 * @Version 1.0
 */
public class NewsUserServiceImpl implements NewsUserService {

    private NewsUserDao userDao = new NewUserDaoImpl();
    @Override
    public NewsUser findByUsername(String username) {
        return userDao.findByUsername(username);

    }

    @Override
    public NewsUser findByUid(Integer userId) {
        return userDao.findByUid(userId);
    }
}
