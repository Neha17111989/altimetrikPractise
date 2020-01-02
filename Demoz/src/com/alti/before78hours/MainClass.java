package com.alti.before78hours;

public class MainClass {
	public static void main(String[] args) throws Exception {
		ImmutableCls emp = new ImmutableCls("Adithya", new Address("Home"));
		Address address = emp.getAdd();
		System.out.println(address);

		address.setZipcode("lalru");
		// address.setCity("Hyderabad");
		System.out.println(emp.getAdd());
	}
}