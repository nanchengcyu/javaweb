package cn.nanchengyu.schedule.dao.impl;

import cn.nanchengyu.schedule.dao.BaseDao;
import cn.nanchengyu.schedule.dao.SysUserDao;
import cn.nanchengyu.schedule.pojo.SysUser;

import java.util.List;

/**
 * ClassName: SysUserDaoImpl
 * Package: cn.nanchengyu.schedule.dao.impl
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/26 0:07
 * @Version 1.0
 */
public class SysUserDaoImpl extends BaseDao implements SysUserDao {

    @Override
    public int addSysUser(SysUser sysUser) {

        String sql ="insert into sys_user value(DEFAULT,?,?)";
        return baseUpdate(sql,sysUser.getUsername(),sysUser.getUserPwd());

    }

    @Override
    public SysUser findByUsernmae(String username) {
        String sql ="select uid,username,user_pwd userPwd from sys_user where username =?";
        List<SysUser> sysUserList = baseQuery(SysUser.class, sql, username);
        return sysUserList!=null&&sysUserList.size()>0?sysUserList.get(0):null;
    }
}
