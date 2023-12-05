package cn.nanchengyu.spring6.aop.example;

/**
 * ClassName: CalculatorImpl
 * Package: cn.nanchengyu.spring6.aop.example
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/5 16:31
 * @Version 1.0
 */
public class CalculatorImpl  implements Calculator{
    @Override
    public int add(int i, int j) {
        int result = i + j;

        System.out.println("方法内部 result ="+result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        System.out.println("方法内部 result ="+result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;
        System.out.println("方法内部 result ="+result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i / j;
        System.out.println("方法内部 result ="+result);
        return result;
    }
}
