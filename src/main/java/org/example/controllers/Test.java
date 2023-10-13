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
        System.out.println(coordinates);

        return ResponseEntity.ok(parser.request(
                coordinates.getLat1(),
                coordinates.getLgn1(),
                coordinates.getLat2(),
                coordinates.getLgn2()
        ));
    }

}
