package org.example.dto.Parser;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.dto.Parser.Elements;

import java.util.List;

@Data
@AllArgsConstructor
public class Rows {

    private List<Elements> elements;

    public Rows(){

    }
}
