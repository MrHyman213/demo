package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Container {
    private List<String> destinationAddresses;
    private List<String> originAddresses;
    private List<Rows> rows;
    private String status;

    public Container(){

    }
}
