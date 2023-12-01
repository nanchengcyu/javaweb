package cn.nanchengyu.schedule.service;

import cn.nanchengyu.schedule.pojo.SysUser;

/**
 * ClassName: SysUserService
 * Package: cn.nanchengyu.schedule.service
 * Description:
 *   接口类仅仅展示方法名，不写逻辑代码，逻辑代码放在实现类中
 * @Author 南城余
 * @Create 2023/11/26 1:20
 * @Version 1.0
 */
public interface SysUserService {
    /**
     * 注册用户的方法
     * @param sysUser
     * @return  注册成功返回1 注册失败返回0
     */
    int regist(SysUser sysUser);

    /**
     * 根据用户名获得完整用户信息的方法
     * @param username  要查询的用户名
     * @return   如果找到了返回sysUser对象，找不到返回null
     */
    SysUser findByUsername(String username);
}
