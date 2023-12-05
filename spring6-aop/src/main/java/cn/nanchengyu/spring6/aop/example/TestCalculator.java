package cn.nanchengyu.spring6.aop.example;

/**
 * ClassName: TestCalculator
 * Package: cn.nanchengyu.spring6.aop.example
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/5 17:39
 * @Version 1.0
 */
public class TestCalculator {
    public static void main(String[] args) {
        //创建代理对象（动态）
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
       Calculator proxy =(Calculator) proxyFactory.getProxy();
        int add = proxy.add(1, 2);
        System.out.println(add);

    }
}
