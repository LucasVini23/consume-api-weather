package com.consume.api.consumeapi.model;

import lombok.Data;

@Data
public class Forecast {
    //rename this fields with "_"
    private String date;
    private String weekday;
    private Integer max;
    private Integer min;
    private String description;
    private String condition;
}
