package com.gustavoboliveira.stockControl.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_store")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.PRIVATE)
    private Long id;

    private String corporateName;

    @JsonIgnore
    @OneToMany(mappedBy = "id")
    private List<Customer> customers;

    @Embedded
    private Address address;

}
