package cn.nanchengyu.spring6.resourceloaderware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ResourceLoader;

/**
 * ClassName: TestDemo
 * Package: cn.nanchengyu.spring6.resourceloaderware
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/6 11:05
 * @Version 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        TestBean testBean = context.getBean("testBean", TestBean.class);
        ResourceLoader resourceLoader = testBean.getResourceLoader();
        System.out.println(context == resourceLoader);
    }
}
