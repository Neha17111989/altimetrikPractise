package com.alti.before78hours;

import java.io.Serializable;

public class SingletonClass implements Cloneable, Serializable {

	private volatile static SingletonClass obj;

	private SingletonClass() {
	}

	public static SingletonClass getInstance() {
		if (obj == null) {

			synchronized (SingletonClass.class) {
				if (obj == null) {
					return obj = new SingletonClass();
				}
			}
		}
		return obj;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return obj;
	}

	protected Object readResolve(){
		return obj;
	}
}
