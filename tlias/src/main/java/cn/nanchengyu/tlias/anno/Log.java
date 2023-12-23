package cn.nanchengyu.tlias.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName: Log
 * Package: cn.nanchengyu.tlias.anno
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/23 17:09
 * @Version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Log {
}
