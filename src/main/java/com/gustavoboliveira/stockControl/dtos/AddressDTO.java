package com.gustavoboliveira.stockControl.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddressDTO {

    private String street;

    private String postalCode;

    private String city;

    private Integer number;

    private String state;

}
