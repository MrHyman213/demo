package org.example.dto;

import com.google.maps.model.LatLng;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Coordinates {
    private double lat1, lat2, lgn1, lgn2;

    public Coordinates(){

    }


}
