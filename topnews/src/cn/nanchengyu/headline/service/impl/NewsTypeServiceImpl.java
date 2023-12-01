package cn.nanchengyu.headline.service.impl;

import cn.nanchengyu.headline.dao.NewsTypeDao;
import cn.nanchengyu.headline.dao.impl.NewUserDaoImpl.NewTypeDaoImpl;
import cn.nanchengyu.headline.pojo.NewsType;
import cn.nanchengyu.headline.service.NewsTypeService;
import cn.nanchengyu.headline.service.NewsUserService;

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
public class NewsTypeServiceImpl implements NewsTypeService {
    private NewsTypeDao typeDao  = new NewTypeDaoImpl();
    @Override
    public List<NewsType> findAll() {
        return typeDao.findAll();
    }
}
