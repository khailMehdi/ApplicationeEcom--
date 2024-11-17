package org.example.discovryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

@EnableEurekaServer
public class DiscovryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscovryServiceApplication.class, args);
    }

}
