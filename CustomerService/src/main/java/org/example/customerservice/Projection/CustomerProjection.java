package org.example.customerservice.Projection;

import org.example.customerservice.Entities.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "all", types = Customer.class)
public interface CustomerProjection {
     Long getId();
     String getName();
     String getEmail();

}
