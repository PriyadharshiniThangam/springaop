package com.springaop.main;


	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaop.employee.Employee;


	public class MainApp {
		public static void main(String[] args) {
			ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "spring-employee.xml" });
			Employee employee = (Employee) appContext.getBean("employee");
			employee.addEmployee();
}
}