package com.gustavoboliveira.stockControl.repositories;

import com.gustavoboliveira.stockControl.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByName(String name);
}
