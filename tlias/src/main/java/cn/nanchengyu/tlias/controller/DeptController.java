package cn.nanchengyu.tlias.controller;

import cn.nanchengyu.tlias.pojo.Dept;
import cn.nanchengyu.tlias.pojo.Result;
import cn.nanchengyu.tlias.service.DeptService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName: DeptController
 * Package: cn.nanchengyu.tlias.controller
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/21 20:16
 * @Version 1.0
 */
@Slf4j
@RestController
@RequestMapping("depts")
public class DeptController {
    //    private static Logger log = LoggerFactory.getLogger(DeptController.class); 此处可以借助@slf4j 注解 具体可以看@slf4j源码
    @Autowired
    private DeptService deptService;

    //    @RequestMapping("/depts")
    @GetMapping
    public Result list() {

        log.info("查询全部部门数据");

        List<Dept> deptList = deptService.list();
        return Result.success(deptList);

    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        log.info("删除部门信息，id:{}", id);
       deptService.delete(id);
       return Result.success();
    }

    @PostMapping
    public Result add(@RequestBody Dept dept) {
        log.info("添加部门信息");
        deptService.add(dept);
        return Result.success();
    }

}
