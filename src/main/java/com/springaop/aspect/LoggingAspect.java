package com.springaop.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class LoggingAspect {
	@Before("execution(* com.springaop.employee.Employee.addEmployee(..))")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println(" Before : " + joinPoint.getSignature().getName());
	}
	@AfterReturning("execution(*com.springaop.employee.Employee.addEmployeeReturnValue*(..))")
    public void logAfterReturningAllMethods() throws Throwable
    {
        System.out.println("****LoggingAspect.logAfterReturningAllMethods() ");
    }
	@After("execution(* com.springaop.employee.Employee.addEmployee(..))")
	public void logAfter(JoinPoint joinPoint) {

		System.out.println("after: " + joinPoint.getSignature().getName());
	}
	@AfterReturning(
		      pointcut = "execution(*com.springaop.employee.Employee.addEmployeeReturnValue(..))",returning= "result")
		   public void logAfterReturning(JoinPoint joinPoint, Object result) {

			System.out.println("After returning : " + joinPoint.getSignature().getName());
			System.out.println("Result:"+ result);

		   }
	 @AfterThrowing(
		      pointcut = "execution(*com.springaop.employee.Employee.addEmployeeThrowException(..))",
		      throwing= "error")
		    public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {

			System.out.println("After throwing: " + joinPoint.getSignature().getName());
			System.out.println("Exception : " + error);

		    }
	 @Around("execution(*com.springaop.employee.Employee.addEmployeeAround(..))")
	   public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("Around : " + joinPoint.getSignature().getName());
		System.out.println("arguments : " + Arrays.toString(joinPoint.getArgs()));
			
		System.out.println("Around before");
		joinPoint.proceed();
		System.out.println("Around after");
			

	 }
	
}
