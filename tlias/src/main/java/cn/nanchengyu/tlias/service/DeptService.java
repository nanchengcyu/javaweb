package cn.nanchengyu.tlias.service;

import cn.nanchengyu.tlias.mapper.DeptMapper;
import cn.nanchengyu.tlias.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * ClassName: Dept
 * Package: cn.nanchengyu.tlias.service
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/21 20:21
 * @Version 1.0
 */
public interface DeptService {

    List<Dept> list();

    void delete(Integer id);

    void add(Dept dept);
}
