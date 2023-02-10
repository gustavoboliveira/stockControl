package com.gustavoboliveira.stockControl.repositories;

import com.gustavoboliveira.stockControl.models.BuyProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyProductRepository extends JpaRepository<BuyProduct, Long> {
}
