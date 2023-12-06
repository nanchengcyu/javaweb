package cn.nanchengyu.boot3.rpc.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: WeatherService
 * Package: cn.nanchengyu.boot3.rpc.service
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/6 18:15
 * @Version 1.0
 */
@Service
public class WeatherService {
    public  Mono<String>weather(String city){
        //远程调用阿里云API
        //1.创建WebClient
        WebClient client = WebClient.create();
        Map<String,String> params = new HashMap<>();
        params.put("area","郑州");

        //2.定义发请求行为
        Mono<String> mono = client.get()
                .uri("https://tianqimore.market.alicloudapi.com?area={area}", params)
                .accept(MediaType.APPLICATION_JSON)
                .header("Authorization", "APPCODE " + "xxxxx")
                .retrieve()
                .bodyToMono(String.class);


        return mono ;

    }
}
