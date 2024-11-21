package org.example.billingservice.Feign;

import org.example.billingservice.Model.Product;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
public interface ProductRestFien {
    @GetMapping("/products/{id}?projection=all")
    Product findProductById(@PathVariable("id") Long id);
    @GetMapping("/products?projection=all")
    PagedModel<Product> findAll();
}
