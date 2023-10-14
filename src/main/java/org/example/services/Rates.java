package org.example.services;


import java.util.Map;

public interface Rates {
    public Map<Integer, Double> getRatesMap(Map<Integer, Integer> times, String faceType);
}
