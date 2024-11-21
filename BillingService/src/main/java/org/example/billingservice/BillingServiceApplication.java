package org.example.billingservice;

import org.example.billingservice.Entitie.Bill;
import org.example.billingservice.Entitie.ProductItems;
import org.example.billingservice.Feign.BillRestFien;
import org.example.billingservice.Feign.ProductRestFien;
import org.example.billingservice.Model.Customer;
import org.example.billingservice.Repository.BillRepository;
import org.example.billingservice.Repository.ProductItemsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillingServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(BillRestFien billRestFien , ProductRestFien productRestFien,
                            BillRepository billRepository , ProductItemsRepository productItemsRepository) {

        return args -> {

            Bill bill=new Bill();
            bill.setBillingDate(new Date());
            Customer customer=billRestFien.getCustomerById(1L);
            bill.setId(customer.getId());
            System.out.println(customer);

            billRepository.save(bill);

                productRestFien.findAll().getContent().forEach( p->{
                    ProductItems product =new ProductItems();
                    product.setProductID(p.getId());
                    product.setBill(bill);
                    product.setProduct(p);
                    product.setId(p.getId());
                    System.out.println(product);
                    productItemsRepository.save(product);

                });



        } ;

    }

}
