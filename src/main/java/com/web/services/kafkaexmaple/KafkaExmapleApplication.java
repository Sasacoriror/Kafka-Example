package com.web.services.kafkaexmaple;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaExmapleApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaExmapleApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate <String, String> kafkaTemplate) {
        return args -> {
            kafkaTemplate.send("DATA1700", "Hello World");
        };
    }

}
