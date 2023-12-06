package cn.nanchengyu.boot312message.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * ClassName: AppKafkaConfiguration
 * Package: cn.nanchengyu.boot312message.config
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/6 21:34
 * @Version 1.0
 */
@Configuration
public class AppKafkaConfiguration {
    @Bean
    public NewTopic topic() {
        return TopicBuilder.name("nanchengyu")
                .partitions(10)
                .compact()
                .build();
    }
}
