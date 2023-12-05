package cn.nanchengyu.spring6.aop.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * ClassName: ProxyFactory
 * Package: cn.nanchengyu.spring6.aop.example
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/5 17:19
 * @Version 1.0
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        //类加载器
        ClassLoader classLoader = target.getClass().getClassLoader();
        //类接口
        Class<?>[] interfaces = target.getClass().getInterfaces();
        //代理对象实现目标对象的方法过程
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println("[动态代理][日志] "+method.getName()+"，参数："+ Arrays.toString(args));
                Object result = method.invoke(target, args);
                System.out.println("[动态代理][日志] "+method.getName()+"，结果："+ result);
                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);

    }


}
