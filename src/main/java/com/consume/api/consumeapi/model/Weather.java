package com.consume.api.consumeapi.model;

import lombok.Data;

@Data
public class Weather {
    //rename this fields with "_"
    private String by;
    private String valid_key;
    private Results results;
    private Double execution_time;
    private Boolean from_cache;

}
