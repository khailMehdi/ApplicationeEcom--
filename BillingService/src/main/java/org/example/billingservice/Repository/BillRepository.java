package org.example.billingservice.Repository;

import org.example.billingservice.Entitie.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {
}
