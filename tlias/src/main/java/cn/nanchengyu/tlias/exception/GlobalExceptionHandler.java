package cn.nanchengyu.tlias.exception;

import cn.nanchengyu.tlias.pojo.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * ClassName: GlobalExceptionHandler
 * Package: cn.nanchengyu.tlias.exception
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/22 23:18
 * @Version 1.0
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public Result ex(Exception ex){
        ex.printStackTrace();
        return Result.error("系统异常");
    }
}
