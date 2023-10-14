package org.example.dto;

import com.google.maps.model.LatLng;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
public class Coordinates {
    private double lat1, lat2, lgn1, lgn2;
    //private List<LatLng> latLngs;

    public Coordinates() {
//        if(latLngs == null)
//            this.latLngs = new ArrayList<>();
    }

}
