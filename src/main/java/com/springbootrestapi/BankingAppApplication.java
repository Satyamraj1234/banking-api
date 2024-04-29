package com.springbootrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("entity")
@ComponentScan({"controller", "service"}) // Assuming controllers and services are in these packages
public class BankingAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(BankingAppApplication.class, args);
    }
}
