package com.gustavoboliveira.stockControl.dtos;

import com.gustavoboliveira.stockControl.models.Address;
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

    public AddressDTO(Address address){
        this.street = address.getStreet();
        this.postalCode = address.getPostalCode();
        this.city = address.getCity();
        this.number = address.getNumber();
        this.state = address.getState();
    }

}
