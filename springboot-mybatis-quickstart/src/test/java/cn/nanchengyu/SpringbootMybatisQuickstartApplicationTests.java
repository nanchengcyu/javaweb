package cn.nanchengyu;

import cn.nanchengyu.mapper.UserMapper;
import cn.nanchengyu.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisQuickstartApplicationTests {
    @Autowired//将UserMapper 此接口需要在接口前声明@Mapper注解  放入IOC 容器管理的对象创建出来
    private UserMapper userMapper;

    @Test
    void textListUser() {
        List<User> list = userMapper.list();
        list.stream().forEach(user ->  System.out.println(user));
    }

}
