package cn.nanchengyu.spring6.validator.one;

import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

/**
 * ClassName: TestPerson
 * Package: cn.nanchengyu.spring6.validator.one
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/6 12:35
 * @Version 1.0
 */
public class TestPerson {
    public static void main(String[] args) {
        //创建Person对象
        Person person = new Person();

        //创建person对应的databinder
        DataBinder dataBinder = new DataBinder(person);

        //设置校验器
        dataBinder.setValidator(new PersonValidator());


        //调用方法执行校验
        dataBinder.validate();

        //输出校验值
        BindingResult bindingResult = dataBinder.getBindingResult();
        System.out.println(bindingResult.getAllErrors());

    }

}
