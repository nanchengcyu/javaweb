package cn.nanchengyu.spring6.validator.two;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * ClassName: ValidationConfig
 * Package: cn.nanchengyu.spring6.validator.two
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/6 15:52
 * @Version 1.0
 */

@Configuration
@ComponentScan("cn.nanchengyu.spring6.validator.two")
public class ValidationConfig {
    @Bean
    public LocalValidatorFactoryBean validator() {
        return new LocalValidatorFactoryBean();
    }
}
