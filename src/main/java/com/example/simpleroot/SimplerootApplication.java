package com.example.simpleroot;

import com.example.simpleroot.repository.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SimplerootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimplerootApplication.class, args);
    }
@Bean
public ModelMapper modelMapper() {
        return new ModelMapper();
}
}
