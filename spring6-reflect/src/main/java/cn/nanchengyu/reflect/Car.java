package cn.nanchengyu.reflect;

/**
 * ClassName: Car
 * Package: cn.nanchengyu.reflect
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/5 10:45
 * @Version 1.0
 */
public class Car {
    private String name;
    private int age;
    private String car;

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car='" + car + '\'' +
                '}';
    }

    public Car(String name, int age, String car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
}
