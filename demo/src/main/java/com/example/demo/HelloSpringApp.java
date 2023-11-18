package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an application context using annotation-based configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the HelloWorld bean from the context
        HelloWorld helloWorld = context.getBean(HelloWorld.class);

        // Call the printMessage method to print "Hello, World!"
        helloWorld.printMessage();
    }
	}
