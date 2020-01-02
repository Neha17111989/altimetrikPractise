package com.alti.before78hours;

public final class ImmutableCls {

	private final String name;
	private final Address add;

	public Address getAdd() throws CloneNotSupportedException {
		return (Address) add.clone();
	}

	ImmutableCls(String n, Address a) {
		this.add = a;
		this.name = n;
	}

	public String getName() {
		return name;
	}
	

}
