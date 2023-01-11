package com.gustavoboliveira.stockControl.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO {

    private Long id;

    private String name;

    private String cpf;

    private AddressDTO address;

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                '}';
    }
}
