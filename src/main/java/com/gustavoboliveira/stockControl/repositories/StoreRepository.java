package com.gustavoboliveira.stockControl.repositories;

import com.gustavoboliveira.stockControl.models.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
}
