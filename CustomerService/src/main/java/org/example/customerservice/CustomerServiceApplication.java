package org.example.customerservice;

import org.example.customerservice.Entities.Customer;
import org.example.customerservice.Repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder()
                    .name("Mehdi").email("mehdi@gmail.com").build());
            customerRepository.save(Customer.builder()
                    .name("jilali").email("jilali@gmail.com").build());
            customerRepository.save(Customer.builder()
                    .name("Achraf").email("achraf@gmail.com").build());

        };
    };
}
