package com.consume.api.consumeapi.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Results {
    //rename this fields with "_"
    private Integer temp;
    private String date;
    private String time;
    private String condition_code;
    private String description;
    private String currently;
    private String cid;
    private String city;
    private String img_id;
    private Integer humidity;
    private String wind_speedy;
    private String sunrise;
    private String sunset;
    private String condition_slug;
    private String city_name;
    private ArrayList<Forecast> forecast;


}
