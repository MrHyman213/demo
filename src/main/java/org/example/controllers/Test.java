package org.example.controllers;

import com.google.maps.errors.ApiException;
import com.google.maps.model.LatLng;
import lombok.RequiredArgsConstructor;
import org.example.dto.Container;
import org.example.dto.Coordinates;
import org.example.services.Parser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class Test {

    private final Parser parser;

    @GetMapping("/test")
    public ResponseEntity<?> test(@RequestBody Coordinates coordinates){
        Container container = parser.request(
                55.76, 37.44, 51.76, 39.43
        );
        System.out.println(container.getOriginAddresses());
        return ResponseEntity.ok("OK");
    }

}
