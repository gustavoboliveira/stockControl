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
public class Store extends BasicModel{

    @JsonIgnore
    @OneToMany(mappedBy = "id")
    private List<Customer> customers;

    @Embedded
    private Address address;

}
