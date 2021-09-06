package com.consume.api.consumeapi;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        RestTemplate restTemplate;
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        restTemplate = restTemplateBuilder.build();
        /*HttpHeaders headers = new HttpHeaders();
        headers.add("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com");
        headers.add("x-rapidapi-key", "b231573849msh02592ab47705739p1d9eb8jsn389e6191a4ac");
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<Teste> teste = restTemplate.exchange("https://community-open-weather-map.p.rapidapi.com/find?q=london&cnt=1&mode=null&lon=0&type=link%2C%20accurate&lat=0&units=imperial%2C%20metric", HttpMethod.GET,  entity, Teste.class);

        System.out.println(Arrays.asList(teste));*/

        HttpHeaders headers = new HttpHeaders();
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        Object teste = restTemplate.getForObject("https://api.hgbrasil.com/weather", Object.class);

        System.out.println(Arrays.asList(teste));

    }

}
