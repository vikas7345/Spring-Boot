package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringBeanScopesApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		  
		 PrototypeBean prototype = context.getBean(PrototypeBean.class);
			  
	     SingletonBean sinBean1 = context.getBean(SingletonBean.class); 
	     
	}

}
