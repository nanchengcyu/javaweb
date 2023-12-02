package cn.nanchengyu.headline.service.impl;

import cn.nanchengyu.headline.dao.NewsUserDao;
import cn.nanchengyu.headline.dao.impl.NewUserDaoImpl.NewUserDaoImpl;
import cn.nanchengyu.headline.pojo.NewsUser;
import cn.nanchengyu.headline.service.NewsUserService;
import cn.nanchengyu.headline.util.MD5Util;

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
    public NewsUser findByUserName(String username) {
        return null;
    }

    @Override
    public NewsUser findByUid(Integer userId) {
        return userDao.findByUid(userId);
    }

    @Override
    public Integer registUser(NewsUser registUser) {
        //处理增加数据的业务
        //将明文密码转换为密文密码
        registUser.setUserPwd(MD5Util.encrypt(registUser.getUserPwd()));
        return userDao.insertUser(registUser);
    }
}
