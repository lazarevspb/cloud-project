package ru.lazarev.cloud.project.product.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableEurekaClient

public class ProductServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApp.class);
    }
}


