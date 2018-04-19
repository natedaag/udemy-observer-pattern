package com.udemy.observer.pattern.subject;

import java.util.ArrayList;
import java.util.List;

import com.udemy.observer.pattern.domain.EmployeeDAO;
import com.udemy.observer.pattern.employment.Employee;
import com.udemy.observer.pattern.observers.IObserver;

public class EmployeeManagementSystem implements ISubject {
	
	private List<Employee> employees;
	private List<IObserver> observers;
	
	private EmployeeDAO empDao;
	
	private Employee employee;
	private String msg;
	
	public EmployeeManagementSystem() {
		observers = new ArrayList<IObserver>();
		empDao = new EmployeeDAO();
		employees = empDao.generateEmployees();
	}

	@Override
	public void registerObserver(IObserver io) {
		observers.add(io);	
	}
	
	@Override
	public void removeObserver(IObserver io) {
		observers.remove(io);
	}
	
	@Override
	public void notifyObservers() {
		for (IObserver departments : observers) {
			departments.callme(employee, msg);
		}
	}

	public void hireNewEmployee(Employee emp) {
		employee = emp;
		msg = "New hire: ";
		employees.add(emp);
		notifyObservers();
	}
	
	public void modifyEmployeeName(int id, String newName) {
		boolean notify = false;
		for (Employee emp : employees) {
			if (id == emp.getEmployeeId()) {
				emp.setName(newName);
				this.employee = emp;
				this.msg = "Employee name has been modified. ";
				notify = true;
			}
		}
		if(notify) {
			notifyObservers();
		}
	}

}
