package com.gustavoboliveira.stockControl.dtos;

import com.gustavoboliveira.stockControl.models.Address;
import lombok.*;

import javax.persistence.Embedded;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO {

    private Long id;

    private String name;

    private String cpf;

    @Embedded
    private Address address;

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                '}';
    }
}
