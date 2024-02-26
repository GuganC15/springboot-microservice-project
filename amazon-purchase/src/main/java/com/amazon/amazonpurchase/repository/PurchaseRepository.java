package com.amazon.amazonpurchase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.amazon.amazonpurchase.entity.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase,Integer>{

}
