package org.example.dto.firstService;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.dto.Parser.Coords;

import java.util.List;

@Data
public class Coordinates {
    private List<Coords> coords;
    private List<Integer> id;
    private Coords userGeo;
    private String moveType;
    private String serviceType;

    public Coordinates() {
    }

    @JsonCreator
    public Coordinates(@JsonProperty("cords") List<Coords> coords,
                       @JsonProperty("id") List<Integer> id,
                       @JsonProperty("user_geo") Coords userGeo,
                       @JsonProperty("move_type") String moveType,
                       @JsonProperty("service_type") String serviceType){
        this.coords = coords;
        this.id = id;
        this.userGeo = userGeo;
        this.moveType = moveType;
        this.serviceType = serviceType;
    }


}
