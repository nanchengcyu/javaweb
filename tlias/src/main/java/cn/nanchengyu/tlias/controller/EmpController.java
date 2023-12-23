package cn.nanchengyu.tlias.controller;

import cn.nanchengyu.tlias.pojo.Emp;
import cn.nanchengyu.tlias.pojo.PageBean;
import cn.nanchengyu.tlias.pojo.Result;
import cn.nanchengyu.tlias.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * ClassName: EmpController
 * Package: cn.nanchengyu.tlias.controller
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/21 20:16
 * @Version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer pageSize
                        , String name, Short gender,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end)  {
        //前端传递两个参数，一个page,一个pageSzie,如果不知道两个参数大小，用@RequestParam赋予其默认值
        log.info("分页查询，参数：{}，{}", page, pageSize);

        PageBean pageBean = empService.page(page, pageSize,name, gender, begin, end);
        return Result.success(pageBean);
    }
    @DeleteMapping("/{ids}")
    public Result delete(@PathVariable List<Integer> ids) {
        log.info("批量删除员工ids:{}",ids);
        empService.delete(ids);
        return Result.success();

    }
    @PostMapping
    public Result save(@RequestBody Emp emp) {
        log.info("新增员工信息:{}",emp);
        empService.save(emp);
        return Result.success();
    }
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
      Emp emp =  empService.getById(id);
        return Result.success(emp);
    }

    @PutMapping
    public Result update(@RequestBody Emp emp){
        empService.update(emp);
        return Result.success();//接口文档中响应数据为null，所以此处空即可
    }
}
