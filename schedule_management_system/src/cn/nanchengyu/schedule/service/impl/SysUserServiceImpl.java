package cn.nanchengyu.schedule.service.impl;

import cn.nanchengyu.schedule.dao.SysUserDao;
import cn.nanchengyu.schedule.dao.impl.SysUserDaoImpl;
import cn.nanchengyu.schedule.pojo.SysUser;
import cn.nanchengyu.schedule.service.SysUserService;
import cn.nanchengyu.schedule.util.MD5Util;

/**
 * ClassName: SysUserServiceImpl
 * Package: cn.nanchengyu.schedule.service.impl
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/26 1:20
 * @Version 1.0
 */
public class SysUserServiceImpl implements SysUserService {

     private SysUserDao userDao = new SysUserDaoImpl();
    @Override
    public int regist(SysUser sysUser) {
        //将用户的明文密码转换为密文密码
//        String userPwd = sysUser.getUserPwd();
//        String encrypt = MD5Util.encrypt(userPwd);
//        sysUser.setUserPwd(encrypt);
        //简化操作
        sysUser.setUserPwd(MD5Util.encrypt(sysUser.getUserPwd()));
        //调用DAO层的方法 将sysUser信息存入数据库
//        int rows = userDao.addSysUser(sysUser);
//        return rows;
        //简化
        return  userDao.addSysUser(sysUser);
    }

    @Override
    public SysUser findByUsername(String username) {


        return  userDao.findByUsernmae(username);
    }
}
