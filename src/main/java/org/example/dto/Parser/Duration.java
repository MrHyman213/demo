package org.example.dto.Parser;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Duration {
    private String text;
    private int value;
}
