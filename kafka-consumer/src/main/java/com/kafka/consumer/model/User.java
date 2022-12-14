package com.kafka.consumer.model;

public class User {


	private String name;
    private String address;
    private String createdAt;

	public User(String name, String address, String createdAt) {
		this.name = name;
		this.address = address;
		this.createdAt = createdAt;
	}

	public User() {
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", address=" + address + ", createdAt=" + createdAt + "]";
	}


}
