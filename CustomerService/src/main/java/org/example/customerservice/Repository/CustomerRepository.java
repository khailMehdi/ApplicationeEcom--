package org.example.customerservice.Repository;

import org.example.customerservice.Entities.Customer;
import org.example.customerservice.Projection.CustomerProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource( excerptProjection = CustomerProjection.class)

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
