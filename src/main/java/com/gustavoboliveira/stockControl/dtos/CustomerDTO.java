package com.gustavoboliveira.stockControl.dtos;

import com.gustavoboliveira.stockControl.models.Address;
import com.gustavoboliveira.stockControl.models.Customer;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO {

    private Long id;

    private String name;

    private String cpf;

    private AddressDTO address;

    public CustomerDTO(Customer customer){
        this.id = customer.getId();
        this.name = customer.getName();
        this.cpf = customer.getCpf();
        this.address = new AddressDTO(customer.getAddress());
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                '}';
    }
}
