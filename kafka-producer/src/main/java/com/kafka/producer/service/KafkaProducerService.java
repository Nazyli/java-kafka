package com.kafka.producer.service;

import com.kafka.producer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
    @Autowired
    KafkaTemplate<String, User> kafkaJSONTemplate;
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;
    private static final String JSON_TOPIC = "sample-json";
    private static final String TOPIC = "sample-kafka";

    public void sendStringMessage(String name) {
        kafkaTemplate.send(TOPIC, name);
    }

    public void sendJsonObject(User user) {
        kafkaJSONTemplate.send(JSON_TOPIC, user);
    }

}
