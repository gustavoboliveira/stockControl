package com.gustavoboliveira.stockControl.dtos;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StoreDTO {

    private Long id;

    private String corporateName;

    private List<CustomerDTO> customerList = new ArrayList<>();

    private AddressDTO address;

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                '}';
    }
}
