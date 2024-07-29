package org.enset.customerservice;

import org.enset.customerservice.entities.Customer;
import org.enset.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class customerserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(customerserviceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(new Customer(null,"zineb","zineb@gmail.com"));
            customerRepository.save(new Customer(null,"mouna","mouna@gmail.com"));
        };
    }
}
