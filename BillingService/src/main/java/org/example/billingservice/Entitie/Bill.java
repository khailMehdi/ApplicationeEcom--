package org.example.billingservice.Entitie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.billingservice.Model.Customer;
import org.springframework.data.annotation.Transient;

import java.util.Collection;
import java.util.Date;
@Entity @NoArgsConstructor @AllArgsConstructor
@Data @Builder
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billingDate;
    @OneToMany(mappedBy = "bill")
    private Collection<ProductItems> productItems;
    private long customerID;
    @Transient
    private Customer customer;
}
