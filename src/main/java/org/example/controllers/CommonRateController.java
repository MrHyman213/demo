package org.example.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.example.dto.firstService.Coordinates;
import org.example.services.Parser;
import org.example.services.RateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CommonRateController {

    private final Parser parser;
    private final RateService rateService;

    @GetMapping("/optimal")
    public ResponseEntity<?> setPoints(@RequestBody Coordinates coordinates) throws JsonProcessingException {
        return ResponseEntity.ok(rateService.getRatesByRoads(coordinates));
    }

}
