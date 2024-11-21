package org.example.billingservice.Feign;

import org.example.billingservice.Model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
public interface BillRestFien {
    @GetMapping("/customers/{id}?projection=all")
    Customer getCustomerById(@PathVariable("id") Long id);
}
