package com.springaop.employee;

public interface Employee {
void addEmployee();
	
	String addEmployeeReturnValue();
	
	void addEmployeeThrowException() throws Exception;
	
	void addEmployeeAround(String name);
}
