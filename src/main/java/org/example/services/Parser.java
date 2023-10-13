package org.example.services;

import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.example.dto.Container;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class Parser {

    private final RestTemplate restTemplate;
    @Value("${api_key}")
    private String key;

    //destinations= side_of_road% 3A 55.7663444 % 2C 37.4412006 & origins= 51.7680296 % 2C 39.4375126
    //https://maps.googleapis.com/maps/api/distancematrix/json


    public Container request(double lat1, double lng1, double lat2, double lng2){
        String body = "https://maps.googleapis.com/maps/api/distancematrix/json";
        // https://maps.googleapis.com/maps/api/distancematrix/json?destinations=side_of_road%3A55.76%2C37.44&origins=51.76%2C39.43&key=AIzaSyDz7Oy1Ak3Wi8O8aNZnvwMsAUi1CXumO_c
        String url = body + "?destinations=side_of_road%3A" + lat1 +"%2C" + lng1 + "&origins=" + lat2 + "%2C" + lng2 + "&key=" + key;
        return restTemplate.getForObject(url, Container.class);
    }
}
