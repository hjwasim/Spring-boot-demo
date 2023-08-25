package com.hjwasim.accessors;

import com.hjwasim.accessors.model.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class AccessorsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccessorsApplication.class, args);
    }

}
