package com.udemy.observer.pattern.employment;

import java.util.Date;

public class Employee {
	
	private String name;
	private Date hireDate;
	private int salary;
	private int employeeId;
	private boolean working = false;
	
	private static int COUNTER;
	
	public Employee(String name, Date hireDate, int salary, boolean working) {
		
		this.name = name;
		this.hireDate = hireDate;
		this.salary = salary;
		this.working = working;
		
		employeeId = ++COUNTER;
	}

	public String toString() {
		return "Employee [name=" + name + 
			   ", hireDate=" + hireDate + 
			   ", salary=" + salary + 
			   ", working=" + working + 
			   "]";
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

}
