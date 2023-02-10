package com.gustavoboliveira.stockControl.models;

import javax.persistence.*;

import com.gustavoboliveira.stockControl.dtos.CustomerDTO;
import com.gustavoboliveira.stockControl.utils.Convertible;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_customer")
public class Customer extends BasicModel implements Convertible<CustomerDTO> {

    private String cpf;

    @Embedded
    private Address address;

    @Override
    public CustomerDTO convert() {
        return new CustomerDTO(this);
    }
}
