package com.web.services.kafkaexmaple.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic LearningTopic(){
        return TopicBuilder.name("DATA1700").build();
    }
}
