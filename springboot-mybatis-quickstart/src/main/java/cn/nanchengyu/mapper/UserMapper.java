package cn.nanchengyu.mapper;

import cn.nanchengyu.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * ClassName: UserMapper
 * Package: cn.nanchengyu.mapper
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/17 20:31
 * @Version 1.0
 */
@Mapper//在运行时，会自动生成该接口的实现类对象（代理对象），并且将该对象交给IOC容器管理
public interface UserMapper {
    //查询全部用户对象
    @Select("select * from t_user")
    public List<User>  list();

}
