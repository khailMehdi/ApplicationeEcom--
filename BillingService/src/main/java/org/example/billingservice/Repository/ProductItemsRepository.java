package org.example.billingservice.Repository;

import org.example.billingservice.Entitie.ProductItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemsRepository extends JpaRepository<ProductItems, Integer> {
}
