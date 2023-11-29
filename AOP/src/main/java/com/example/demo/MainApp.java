package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
	            new AnnotationConfigApplicationContext(AppConfig.class);

	        MyService myService = context.getBean(MyService.class);
	        System.out.println(myService.greet("Joy"));
	        System.out.println(myService.add(5, 3));

	        context.close();
	    }
	}
