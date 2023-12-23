package cn.nanchengyu.tlias.aop;

import cn.nanchengyu.tlias.mapper.OperateLogMapper;
import cn.nanchengyu.tlias.pojo.OperateLog;
import cn.nanchengyu.tlias.utils.JwtUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * ClassName: LogAspect
 * Package: cn.nanchengyu.tlias.aop
 * Description:
 *    在需要存入日志表的controller方法中加上注解
 * @Author 南城余
 * @Create 2023/12/23 17:11
 * @Version 1.0
 */
@Slf4j
@Component
@Aspect //切面类
public class LogAspect {
    @Autowired
    private OperateLogMapper operateLogMapper;
    @Autowired
    private HttpServletRequest httpServletRequest;
    @Around("@annotation(cn.nanchengyu.tlias.anno.Log)")  //环绕通知 另外还有四种通知注解
    public Object recordLog(ProceedingJoinPoint joinPoint) throws Throwable {
        //操作人ID - 从JWT令牌中获取
        String token = httpServletRequest.getHeader("token");
        Claims claims = JwtUtils.parseJWT(token);
        Integer operateUser = (Integer) claims.get("id");
       //操作时间
        LocalDateTime operaTime = LocalDateTime.now();
        //操作的类名
        String className = joinPoint.getTarget().getClass().getName();
        //操作类中的方法名
        String methodName = joinPoint.getSignature().getName();
        //操作方法的参数
        Object[] args = joinPoint.getArgs(); //调用时拿到的是一个数组，此处应该打印参数名字
        String methodParams = Arrays.toString(args);
        //方法返回值
        //调用原始方法目标的运行
        long begin = System.currentTimeMillis();
        Object result = joinPoint.proceed();

        long end = System.currentTimeMillis();

        //将方法返回值转为json字符串
        String returnValue = JSONObject.toJSONString(result);

        //操作耗时
        Long costTime = end - begin;


        //记录操作日志
        OperateLog operateLog = new OperateLog(null,operateUser,operaTime,className,methodName,methodParams,returnValue,costTime);
        operateLogMapper.insert(operateLog);


        return result;

    }
}
