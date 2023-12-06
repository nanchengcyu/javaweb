package cn.nanchengyu.boot3.rpc.controller;

import cn.nanchengyu.boot3.rpc.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * ClassName: WeatherController
 * Package: cn.nanchengyu.boot3.rpc.controller
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/6 18:11
 * @Version 1.0
 */
@RestController
public class WeatherController {
    @Autowired
    WeatherService weatherService;
    @GetMapping("/weather")
    public  Mono<String> weather(@RequestParam("city") String city){
        Mono<String>  weather = weatherService.weather(city);
        return weather;
    }

}
