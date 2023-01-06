package com.gustavoboliveira.stockControl.repositories;

import com.gustavoboliveira.stockControl.models.Buy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyRepository extends JpaRepository<Buy, Long> {
}
