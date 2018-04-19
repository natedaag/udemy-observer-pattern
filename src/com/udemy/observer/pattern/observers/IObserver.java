package com.udemy.observer.pattern.observers;

import com.udemy.observer.pattern.employment.Employee;

public interface IObserver {
	
	void callme(Employee emp, String msg);

}
