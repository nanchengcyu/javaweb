package cn.nanchengyu.tlias.service;

import cn.nanchengyu.tlias.pojo.Emp;
import cn.nanchengyu.tlias.pojo.PageBean;

import java.time.LocalDate;
import java.util.List;

/**
 * ClassName: Emp
 * Package: cn.nanchengyu.tlias.service
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/21 20:22
 * @Version 1.0
 */
public interface EmpService {
    PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin,LocalDate end);

    /**
     * 批量删除用户
     * @param ids
     */
    void delete(List<Integer> ids);

    void save(Emp emp);

    Emp getById(Integer id);

    void update(Emp emp);

    Emp login(Emp emp);
}
