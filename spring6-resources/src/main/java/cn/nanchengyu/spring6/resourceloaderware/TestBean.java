package cn.nanchengyu.spring6.resourceloaderware;

import cn.nanchengyu.spring6.resourceloader.ResourceLoaderDemo;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

/**
 * ClassName: TestBean
 * Package: cn.nanchengyu.spring6.resourceloaderware
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/6 10:53
 * @Version 1.0
 */
public class TestBean implements ResourceLoaderAware {
    private ResourceLoader resourceLoader;
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }
    public ResourceLoader getResourceLoader(){
        return  this.resourceLoader;
    }
}
