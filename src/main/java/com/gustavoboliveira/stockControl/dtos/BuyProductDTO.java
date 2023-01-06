package com.gustavoboliveira.stockControl.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BuyProductDTO {

    private Long id;

    private Long idProduct;

    private Long idBuy;

    private Integer quantity;

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                '}';
    }
}
