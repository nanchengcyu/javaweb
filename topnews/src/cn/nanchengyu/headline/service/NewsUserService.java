package cn.nanchengyu.headline.service;

import cn.nanchengyu.headline.pojo.NewsUser;

/**
 * ClassName: newUserService
 * Package: cn.nanchengyu.headline.service
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/30 23:08
 * @Version 1.0
 */
public interface NewsUserService {
    /**
     * 根据用户登录的账号找用户信息
     * @param username  用户输入的账号
     * @return  找到返回NewsUser对象，找不到返回null
     */
    NewsUser findByUserName(String username);

    NewsUser findByUid(Integer userId);


    Integer registUser(NewsUser registUser);
}
