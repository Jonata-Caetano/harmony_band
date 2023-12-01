package com.nexus.harmonyband;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HarmonybandApiApplication {

    public static void main(String[] args) {

        SpringApplication.run(HarmonybandApiApplication.class, args);
    }

}
