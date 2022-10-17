package com.kafka.producer.controller;

import com.kafka.producer.model.User;
import com.kafka.producer.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/kafka")
public class KafkaProducerController {

	@Autowired
	KafkaProducerService kafkaProducerService;

	@PostMapping("/publish/simple")
	public ResponseEntity<String> publishMessage(@RequestParam(name = "data") String data) {
		kafkaProducerService.sendStringMessage(data);
		return new ResponseEntity<>("Published Successfully", HttpStatus.OK);
	}

	@PostMapping("/publish/json")
	public ResponseEntity<String> publishJSONMessage(@RequestBody User user) {
		user.setCreatedAt(new Date().toString());
		kafkaProducerService.sendJsonObject(user);
		return new ResponseEntity<>("Json Published Successfully", HttpStatus.OK);
	}
}
