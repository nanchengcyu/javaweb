package cn.nanchengyu.headline.service;

import cn.nanchengyu.headline.pojo.NewsType;

import java.util.List;

/**
 * ClassName: newUserService
 * Package: cn.nanchengyu.headline.service
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/30 23:08
 * @Version 1.0
 */
public interface NewsTypeService {
    List<NewsType> findAll();
}
