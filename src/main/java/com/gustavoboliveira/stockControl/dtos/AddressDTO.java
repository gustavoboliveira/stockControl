package com.gustavoboliveira.stockControl.dtos;

import lombok.*;

import javax.persistence.Embeddable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class AddressDTO {

    private String street;

    private String postalCode;

    private String city;

    private Integer number;

    private String state;

}
