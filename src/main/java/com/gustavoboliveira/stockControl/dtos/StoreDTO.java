package com.gustavoboliveira.stockControl.dtos;

import com.gustavoboliveira.stockControl.models.Address;
import com.gustavoboliveira.stockControl.models.Customer;
import lombok.*;

import javax.persistence.Embedded;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StoreDTO {

    private Long id;

    private String corporateName;

    private List<Customer> customerList = new ArrayList<>();

    @Embedded
    private Address address;

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                '}';
    }
}
