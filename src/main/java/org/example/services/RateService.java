package org.example.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.example.dto.firstService.Container;
import org.example.dto.firstService.Coordinates;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class RateService {

    private Map<Integer, Integer> times = new HashMap<>();
    private Map<Integer, Double> rates;
    private final Parser parser;

    public Map<Integer, Double> getRatesByRoads(Coordinates coordinates) throws JsonProcessingException {
        for (int i = 0; i < coordinates.getId().size(); i++){
            Container container = parser.request(
                    coordinates.getCoords().get(i).getLat(),
                    coordinates.getCoords().get(i).getLng(),
                    coordinates.getUserGeo().getLat(),
                    coordinates.getUserGeo().getLng(),
                    coordinates.getId().get(i),
                    coordinates.getMoveType()
            );
            times.put(coordinates.getId().get(i),
                    container.getRows().get(0)
                            .getElements().get(0)
                            .getDuration().getValue());
        }
        Rates rt = new Rates() {
            @Override
            public Map<Integer, Double> getRatesMap(Map<Integer, Integer> times, String faceType) {
                Map<Integer, Double> map = new HashMap<>();
                map.put(1234234234, 4444.3434);
                return map;
            }
        };
        return rt.getRatesMap(times, coordinates.getMoveType());
    }

    public void setLoad(Map<Integer, Double> rates){
        this.rates = rates;
    }

    public Map<Integer, Double> getBestRate(){
        return rates;
    }


}
