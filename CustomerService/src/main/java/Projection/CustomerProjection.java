package Projection;

import org.example.customerservice.Entities.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "all", types = Customer.class)
public interface CustomerProjection {
    public Long getId();
    public String getName();
    public String getEmail();

}
