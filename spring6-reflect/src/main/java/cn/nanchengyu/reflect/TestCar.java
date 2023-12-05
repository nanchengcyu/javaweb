package cn.nanchengyu.reflect;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * ClassName: TestCar
 * Package: cn.nanchengyu.reflect
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/5 10:47
 * @Version 1.0
 */
public class TestCar {
    //1.获取class对象多种方式
    @Test
    public void testGetClass() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1. 类名.class
        Class carClass = Car.class;
        //2.对象.getClass()
        Class aClass = new Car().getClass();
        //3.class.forName("全路径")
        Class aClass1 = Class.forName("cn.nanchengyu.reflect.Car");

        Car car =(Car)aClass1.getDeclaredConstructor().newInstance();
        System.out.println(car);
    }
    //2.获取构造方法

    //3.获取属性
    @Test
    public void testGetField() throws  NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {


        Class<Car> carClass = Car.class;
        Car car = (Car) carClass.getDeclaredConstructor().newInstance();
        //获取所有public属性
        Field[] fields = carClass.getFields();
        //获取所有属性，包括私有的
        Field[] declaredFields = carClass.getDeclaredFields();
        for (Field field : declaredFields){
            if (field.getName().equals("name")){
            //设置允许访问
                field.setAccessible(true);
                field.set(car,"geek");
            }
            System.out.println(field.getName());
            System.out.println(car);
        }

    }
    //4.获取方法
    @Test
    public void test() throws Exception{

    }
}
