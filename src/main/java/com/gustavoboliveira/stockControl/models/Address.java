package com.gustavoboliveira.stockControl.models;

import lombok.*;

import javax.persistence.Embeddable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class Address {

    private String street;

    private String postalCode;

    private String city;

    private Integer number;

    private String state;

}
