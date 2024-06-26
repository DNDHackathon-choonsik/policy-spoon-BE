package com.example.policyspoon;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@OpenAPIDefinition(servers = {
        @Server(url = "/", description = "Default Server URL")
})

@SpringBootApplication
@EnableJpaAuditing
@EnableFeignClients
public class PolicySpoonApplication {

    public static void main(String[] args) {
        SpringApplication.run(PolicySpoonApplication.class, args);
    }

}
