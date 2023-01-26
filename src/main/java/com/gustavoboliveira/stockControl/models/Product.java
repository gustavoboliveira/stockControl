package com.gustavoboliveira.stockControl.models;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_product")
public class Product extends BasicModel{

    private BigDecimal buyPrice;

    private BigDecimal sellPrice;

    private Integer quantity;

}
