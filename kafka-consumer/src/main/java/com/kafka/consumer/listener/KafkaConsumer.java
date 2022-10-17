package com.kafka.consumer.listener;

import com.kafka.consumer.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "sample-kafka", groupId = "group_id")
    public void consume(String message) {
        System.out.println("consumed msg: " + message);
    }

    @KafkaListener(topics = "sample-json", groupId = "group_id_json", containerFactory = "jsonKafkaListenerContainerFactory")
    public void consumeJson(User user) {
        System.out.println("consumed json: " + user.toString());
    }
}
