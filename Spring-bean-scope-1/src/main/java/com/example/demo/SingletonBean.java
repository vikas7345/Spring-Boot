package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

Clients clients = new Clients("Rahul",23,"Mumbai");
    
	public SingletonBean() {
		System.out.println("SingletonBean instance created.");
		System.out.println("name : "+clients.getName());
		System.out.println("Age : "+clients.getAge());
		System.out.println("City : "+clients.getCity());
		
	}
}
