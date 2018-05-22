package org.spring.springboot.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.spring.springboot.domain.City;
import org.spring.springboot.dubbo.CityDubboService;
import org.springframework.stereotype.Service;

/**
 * 城市 Dubbo 服务消费者
 *
 * Created by bysocket on 28/02/2017.
 */
@Service
public class CityDubboConsumerService {

    @Reference(version = "1.0.0")
    CityDubboService cityDubboService;

    public City findCityById(long id ) {
        City city = cityDubboService.findCityById(id);
        return city;
    }
}