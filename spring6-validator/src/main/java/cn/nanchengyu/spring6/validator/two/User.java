package cn.nanchengyu.spring6.validator.two;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

/**
 * ClassName: User
 * Package: cn.nanchengyu.spring6.validator.two
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/6 15:55
 * @Version 1.0
 */
public class User {
    @NotNull
    private String name;
    @Min(0)
    @Max(200)
    private int age;

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
}

