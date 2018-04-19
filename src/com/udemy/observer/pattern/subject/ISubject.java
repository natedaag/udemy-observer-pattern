package com.udemy.observer.pattern.subject;

import com.udemy.observer.pattern.observers.IObserver;

public interface ISubject {
	
	public void registerObserver(IObserver io);
	public void removeObserver(IObserver io);
	public void notifyObservers();
	

}
