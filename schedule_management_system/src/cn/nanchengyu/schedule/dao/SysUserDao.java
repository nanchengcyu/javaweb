package cn.nanchengyu.schedule.dao;

import cn.nanchengyu.schedule.pojo.SysUser;

/**
 * ClassName: SysUserDao
 * Package: cn.nanchengyu.schedule.dao
 * Description:
 *    该类z中用于数据库的CRUD的方法
 *
 * @Author 南城余
 * @Create 2023/11/26 0:00
 * @Version 1.0
 */
public interface SysUserDao {

    /**
     * 向数据库中增加一条用户记录的方法
     * @param sysUser 要增加的记录的username和user_pwd以SysUser实体类对象的形式接受
     * @return  增加成功返回1 失败则0
     */
    int addSysUser(SysUser sysUser);

    SysUser findByUsernmae(String username);
}
