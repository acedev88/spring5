package com.example.spring5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring5Application {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(Spring5Application.class, args);
    }
}
