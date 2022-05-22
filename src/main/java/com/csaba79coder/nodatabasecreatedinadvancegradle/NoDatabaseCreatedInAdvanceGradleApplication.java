package com.csaba79coder.nodatabasecreatedinadvancegradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@EntityScan(basePackages = {"com.springboard.backend"})
@SpringBootApplication
public class NoDatabaseCreatedInAdvanceGradleApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoDatabaseCreatedInAdvanceGradleApplication.class, args);
    }

}
