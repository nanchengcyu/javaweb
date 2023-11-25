package cn.nanchengyu.schedule.pojo;

import java.io.Serializable;
import java.util.Objects;

/**
 * ClassName: SysUser
 * Package: cn.nanchengyu.schedule.pojo
 * Description:
 *    1.实体类的类名和表格名应该对应
 *    2.实体类的属性和表格的列名应该对应
 *    3.每个属性都必须私有的
 *    4.每个属性都应具备 getter setter
 *    5.必须具有无参构造器
 *    6.应该实现无序列化接口
 *    7.应该重写hashcode和equals方法
 *    8.toString是否重写都可以
 *    上面这些内容可以使用lombok插件，使用后不用再次生成
 * @Author 南城余
 * @Create 2023/11/25 23:38
 * @Version 1.0
 */
public class SysUser implements Serializable {
      private Integer uid;
      private String username;
      private String userPwd;

    public SysUser() {
    }

    public SysUser(Integer uid, String username, String userPwd) {
        this.uid = uid;
        this.username = username;
        this.userPwd = userPwd;
    }

    public Integer getUid() {
        return uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysUser sysUser = (SysUser) o;
        return Objects.equals(uid, sysUser.uid) && Objects.equals(username, sysUser.username) && Objects.equals(userPwd, sysUser.userPwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, username, userPwd);
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", userPwd='" + userPwd + '\'' +
                '}';
    }
}
