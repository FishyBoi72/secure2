package org.example.secure2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Secure2Application {
    public static void main(String[] args) {
        SpringApplication.run(Secure2Application.class, args);
    }
}
