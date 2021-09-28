package com.consume.api.consumeapi.service;

import com.consume.api.consumeapi.model.Weather;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Log4j2
@Service
public class WeatherService {

    @Autowired
    RestTemplate restTemplate;

    private static final String URL_WEATHER = "https://api.hgbrasil.com/weather";
    private static final String URL_WEATHER_WITH_CITY = "https://api.hgbrasil.com/weather?woeid=424228";

    public Weather getWeatherApi(){
        return restTemplate.getForObject(URL_WEATHER, Weather.class);
    }

    public Weather getWeatherForCity(){
        return restTemplate.getForObject(URL_WEATHER_WITH_CITY, Weather.class);
    }

    //Refactoring
    public Map<String, String> getForWeekDay(String weekDay){
        HashMap<String, String> map = new HashMap<>();
        try{
            Weather weather = restTemplate.getForObject(URL_WEATHER_WITH_CITY, Weather.class);
            for (int x = 0; x < 7; x++){
                if (weekDay.contains(weather.getResults().getForecast().get(x).getWeekday())){
                    map.put("date", weather.getResults().getForecast().get(x).getDate());
                    map.put("weekday", weather.getResults().getForecast().get(x).getWeekday());
                    map.put("max", weather.getResults().getForecast().get(x).getMax().toString());
                    map.put("min", weather.getResults().getForecast().get(x).getMin().toString());
                    map.put("description", weather.getResults().getForecast().get(x).getDescription());
                    map.put("condition", weather.getResults().getForecast().get(x).getCondition());
                    return map;
                }
            }
        }
        catch(NullPointerException ex) {
            log.error(ex.getMessage());
        }
        return map;
    }

}
