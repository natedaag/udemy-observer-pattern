package com.udemy.observer.pattern.clients;

import com.udemy.observer.pattern.observers.HRDepartment;
import com.udemy.observer.pattern.observers.IObserver;
import com.udemy.observer.pattern.observers.PayrollDepartment;
import com.udemy.observer.pattern.subject.EmployeeManagementSystem;

public class App {
	
	public static void main(String[] args) {
		
		IObserver payroll = new PayrollDepartment();
		IObserver hrSystem = new HRDepartment();
		
		EmployeeManagementSystem ems = new EmployeeManagementSystem();
		
		ems.registerObserver(payroll);
		ems.registerObserver(hrSystem);
		
//		Employee Bob = new Employee("Bob", new Date(0), 3500, true);
//		ems.hireNewEmployee(Bob);
		
		ems.modifyEmployeeName(5, "Nate");
	}

}
