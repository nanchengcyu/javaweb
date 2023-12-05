package cn.nanchengyu.spring6.aop.example;

/**
 * ClassName: Calculator
 * Package: cn.nanchengyu.spring6.aop.example
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/5 16:29
 * @Version 1.0
 */
public interface Calculator {
    //定义加减乘除四个实现方法
    int add(int i,int j);
    int sub(int i,int j);
    int mul(int i,int j);
    int div(int i,int j);

}
