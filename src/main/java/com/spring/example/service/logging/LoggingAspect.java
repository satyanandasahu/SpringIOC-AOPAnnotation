package com.spring.example.service.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	/**
	 * Declaring after advice
	 * 
	 * @param jointPoint
	 * @throws Throwable
	 */
	@After("execution(* com.spring.example.service.*.*(..))")
	public void afterAdviceForAllMethods(JoinPoint jointPoint) throws Throwable {
		System.out.println("\nLoggingAspect.afterAdviceForAllMethods() " + jointPoint.getThis().getClass().getName());
	}

	/**
	 * Declaring after advice for all transfer methods whose taking three arguments
	 * of any type of all classes in the package com.doj.aopapp.service
	 * 
	 * @param jointPoint
	 * @throws Throwable
	 */
	@Before("execution(* com.spring.example.service.*.*(..))")
	public void beforeAdviceForMethods(JoinPoint jointPoint) throws Throwable {
		System.out.println(
				"\nLoggingAspect.beforeAdviceForAllMethods() " + jointPoint.getThis().getClass().getName() + "\n");
	}

}
