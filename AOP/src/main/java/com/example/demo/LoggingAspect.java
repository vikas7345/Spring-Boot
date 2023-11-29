package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class LoggingAspect {
	 @Before("execution(* com.example.demo.service.*.*(..))")
	    public void logBefore(JoinPoint joinPoint) {
	        System.out.println("Before " + joinPoint.getSignature().getName() + " method");
	    }

	    @AfterReturning(
	        pointcut = "execution(* com.example.demo.service.*.*(..))",
	        returning = "result"
	    )
	    public void logAfterReturning(JoinPoint joinPoint, Object result) {
	        System.out.println("After " + joinPoint.getSignature().getName() + " method");
	        System.out.println("Returned value: " + result);
	    }
}
