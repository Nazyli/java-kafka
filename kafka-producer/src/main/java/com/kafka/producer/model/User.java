package com.kafka.producer.model;

import lombok.Data;

import java.util.Date;

@Data
public class User {
	private String name;
	private String address;
	private Date createdAt;
}