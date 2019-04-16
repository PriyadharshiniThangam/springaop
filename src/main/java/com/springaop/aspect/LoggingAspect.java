package com.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class LoggingAspect {
	@Before("execution(* com.springaop.employee.Employee.addCustomer(..))")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println("logging");
		System.out.println("executed: " + joinPoint.getSignature().getName());
	}
}
