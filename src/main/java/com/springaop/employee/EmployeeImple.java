package com.springaop.employee;

public class EmployeeImple implements Employee {
	public void addEmployee(){
		System.out.println("Employee added ");
	}
	
	public String addEmployeeReturnValue(){
		System.out.println("addEmployeeReturnValue() is running ");
		return "priya";
	}
	
	public void addEmployeeThrowException() throws Exception {
		System.out.println("addEmployeeThrowException");
		throw new Exception("Error");
	}
	
	public void addEmployeeAround(String name){
		System.out.println("addEmployeeAround : " + name);
	}
}
