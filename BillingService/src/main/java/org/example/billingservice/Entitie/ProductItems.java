package org.example.billingservice.Entitie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.billingservice.Model.Product;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProductItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long productID;
    private double price;
    private double quantity;
    @ManyToOne
    private Bill bill;
    @Transient private Product product;
}
