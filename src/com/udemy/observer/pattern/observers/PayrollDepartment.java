package com.udemy.observer.pattern.observers;

import com.udemy.observer.pattern.employment.Employee;

public class PayrollDepartment implements IObserver {

	@Override
	public void callme(Employee emp, String msg) {
		System.out.println("Payroll Department Notified...");
		System.out.println(msg + emp.getName());
	}

}
