package org.example.billingservice.Repository;

import org.example.billingservice.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
