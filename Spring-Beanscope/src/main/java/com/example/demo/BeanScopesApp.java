package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BeanScopesApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SingletonBean singleton1 = context.getBean(SingletonBean.class);
        SingletonBean singleton2 = context.getBean(SingletonBean.class);

        System.out.println("Are singleton beans the same? " + (singleton1 == singleton2));

        PrototypeBean prototype1 = context.getBean(PrototypeBean.class);
        PrototypeBean prototype2 = context.getBean(PrototypeBean.class);

        System.out.println("Are prototype beans the same? " + (prototype1 == prototype2));
    }

	}
