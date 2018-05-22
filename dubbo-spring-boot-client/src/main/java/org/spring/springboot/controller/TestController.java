package org.spring.springboot.controller;

import org.spring.springboot.common.Result;
import org.spring.springboot.domain.City;
import org.spring.springboot.dubbo.CityDubboConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    CityDubboConsumerService cityDubboConsumerService;

    @RequestMapping(value = "/findCityById")
    @ResponseBody
    public Result findCityById(@RequestParam(value = "id") Long id) {
        Result<City> result = new Result<>();
        if (id != null) {
            City city = cityDubboConsumerService.findCityById(id);
            result.setData(city);
        }
        return result;
    }
}
