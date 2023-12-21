package cn.nanchengyu.tlias.service.impl;


import cn.nanchengyu.tlias.mapper.DeptMapper;
import cn.nanchengyu.tlias.pojo.Dept;
import cn.nanchengyu.tlias.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * ClassName: DeptServiceImpl
 * Package: cn.nanchengyu.tlias.service.impl
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/21 20:22
 * @Version 1.0
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }

    @Override
    public void delete(Integer id) {
        deptMapper.deleteById(id);
    }

    @Override
    public void add(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.insert();

    }
}
