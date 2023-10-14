package org.example.services;

import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.example.dto.Container;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class Parser {

    private final RestTemplate restTemplate;
    @Value("${api_key}")
    private String key;

    public Container request(double lat1, double lng1, double lat2, double lng2){
        String body = "https://maps.googleapis.com/maps/api/distancematrix/json";
        String url = body + "?destinations=side_of_road%3A" + lat1 + "%2C" + lng1 + "&origins=" + lat2 + "%2C" + lng2 + "&key=" + key;
        System.out.println(url);
        System.out.println(restTemplate.getForObject(url, String.class));
        return restTemplate.getForObject(url, Container.class);
    }
}
