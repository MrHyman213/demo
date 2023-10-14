package org.example.dto.Parser;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.dto.Parser.Distance;
import org.example.dto.Parser.Duration;

@Data
@AllArgsConstructor
public class Elements {
    private Distance distance;
    private Duration duration;
    private String status;
    public Elements(){

    }
}
