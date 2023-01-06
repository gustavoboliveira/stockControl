package com.gustavoboliveira.stockControl.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_buy")
public class Buy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.PRIVATE)
    private Long id;

    @OneToOne
    private Customer customer;

    @OneToOne
    private Store store;

    @JsonIgnore
    @OneToMany(mappedBy = "id")
    private List<Product> products;

}
