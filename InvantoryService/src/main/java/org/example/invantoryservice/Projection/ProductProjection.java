package org.example.invantoryservice.Projection;

import org.example.invantoryservice.entities.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "all", types = { Product.class })
public interface ProductProjection {
     String getId();
     String getName();
     double getPrice();
     int getQuantity();

}
