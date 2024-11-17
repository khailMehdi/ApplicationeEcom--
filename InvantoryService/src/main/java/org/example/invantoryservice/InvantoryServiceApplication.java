package org.example.invantoryservice;

import org.example.invantoryservice.Repository.ProductRepository;
import org.example.invantoryservice.entities.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InvantoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InvantoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder()
                    .id("1").name("printer").price(125).quentity(5).build());
            productRepository.save(Product.builder()
                    .id("2").name("Pc").price(12500).quentity(2).build());
            productRepository.save(Product.builder()
                    .id("3").name("Iphone").price(12115).quentity(8).build());
        };
    };
}
