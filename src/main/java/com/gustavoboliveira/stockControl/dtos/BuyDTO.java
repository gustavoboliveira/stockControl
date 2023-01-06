package com.gustavoboliveira.stockControl.dtos;

import com.gustavoboliveira.stockControl.models.Customer;
import com.gustavoboliveira.stockControl.models.Product;
import com.gustavoboliveira.stockControl.models.Store;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BuyDTO {

    private Long id;

    private Customer customer;

    private Store store;

    private List<Product> productList;

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                '}';
    }
}
