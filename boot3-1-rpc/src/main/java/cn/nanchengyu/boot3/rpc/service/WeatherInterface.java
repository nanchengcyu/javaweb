package cn.nanchengyu.boot3.rpc.service;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

/**
 * ClassName: WeatherInterface
 * Package: cn.nanchengyu.boot3.rpc.service
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/6 20:28
 * @Version 1.0
 */
public interface WeatherInterface {
    //https://tianqimore.market.alicloudapi.com?
    @GetExchange(url ="/weather", accept = "application/json")
    String getWeather(@RequestParam("area") String city, @RequestHeader("Authorization")String auth);
}
