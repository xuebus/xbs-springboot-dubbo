package org.spring.springboot.dubbo;

import org.spring.springboot.domain.City;

/**
 * 城市业务 Dubbo 服务层
 *
 * Created by xuebusi on 28/02/2017.
 */
public interface CityDubboService {

    /**
     * 查询城市信息
     */
    City findCityById(long id);
}
