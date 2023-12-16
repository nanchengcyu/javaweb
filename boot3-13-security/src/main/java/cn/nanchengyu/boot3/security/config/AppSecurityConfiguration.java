package cn.nanchengyu.boot3.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.web.SecurityFilterChain;

/**
 * ClassName: AppSecurityConfiguration
 * Package: cn.nanchengyu.boot3.security.config
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/7 10:45
 * @Version 1.0
 */
@Configuration
public class AppSecurityConfiguration {


    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(registry ->{
            registry.requestMatchers("/").permitAll()//首页所有人都允许访问
                    .anyRequest().authenticated(); //剩下的任意请求都需要认证
        });
        //表单登录
//        http.formLogin();
        return http.build();
    }

}
