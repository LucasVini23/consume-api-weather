package com.consume.api.consumeapi.controller;

import com.consume.api.consumeapi.model.Weather;
import com.consume.api.consumeapi.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping
    public Weather getWeatherApi(){
        return weatherService.getWeatherApi();
    }

    @GetMapping("/city")
    public Weather getWeatherForCity(){
        return weatherService.getWeatherForCity();
    }

    @GetMapping("/weekDay/{weekday}")
    public Map<String, String> getForWeekDay(@PathVariable("weekday") String weekDay){
        return weatherService.getForWeekDay(weekDay);
    }

}
