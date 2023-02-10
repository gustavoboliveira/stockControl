package com.gustavoboliveira.stockControl.dtos;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDTO {

    private Long id;

    private String name;

    private BigDecimal buyPrice;

    private BigDecimal sellPrice;

    private Integer quantity;

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                '}';
    }
}
