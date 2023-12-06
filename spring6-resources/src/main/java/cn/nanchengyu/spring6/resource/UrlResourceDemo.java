package cn.nanchengyu.spring6.resource;

import org.springframework.core.io.UrlResource;

import java.net.MalformedURLException;

/**
 * ClassName: UrlResourceDemo
 * Package: cn.nanchengyu.spring6.resource
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/6 10:28
 * @Version 1.0
 */
public class UrlResourceDemo {
    public static void main(String[] args) {
        loadUrlResource("https://www.baidu.com/");

    }

    //访问前缀http、file的方法
    public static void loadUrlResource(String path) {
        //创建Resource实现类的对象UrlResource
        try {
            UrlResource url = new UrlResource(path);
            System.out.println(url.getFilename());
            System.out.println(url.getURI());
            System.out.println(url.getURL());
            System.out.println(url.getDescription());
            System.out.println(url.getInputStream().read());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
