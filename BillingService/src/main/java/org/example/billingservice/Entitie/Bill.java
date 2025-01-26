package org.example.billingservice.Entitie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.billingservice.Model.Customer;
import org.springframework.data.annotation.Transient;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@NoArgsConstructor @AllArgsConstructor
@Data
//class entity
@Entity
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billingDate;
    private long customerId;
    @OneToMany(mappedBy = "bill")
    private Collection<ProductItems> productItems;
    @Transient private Customer customer;
}

