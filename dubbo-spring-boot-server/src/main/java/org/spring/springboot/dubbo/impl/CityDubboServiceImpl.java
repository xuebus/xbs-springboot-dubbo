package org.spring.springboot.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.spring.springboot.domain.City;
import org.spring.springboot.dubbo.CityDubboService;

/**
 * 城市业务 Dubbo 服务层实现层
 *
 * Created by bysocket on 28/02/2017.
 */
// 注册为 Dubbo 服务
@Service(version = "1.0.0")
public class CityDubboServiceImpl implements CityDubboService {

    public City findCityById(long id) {
        if (id == 1) {
            return new City(1L,2L,"北京","中国的首都");
        }
        return null;
    }
}