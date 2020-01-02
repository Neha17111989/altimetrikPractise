package com.altimetrik.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class NameSorter implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
}

class Employee {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Employee(String name) {
		this.name = name;
	}

	/*
	 * public static int nameCompare(Employee a1, Employee a2) { return
	 * a1.name.compareTo(a2.name); }
	 */

	public String toString() {
		return name;
	}

	/*
	 * @Override public int compareTo(Employee o) { // TODO Auto-generated method
	 * stub return o.name.compareTo(this.name); }
	 */
}

public class BoxedStreamsExample {

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<Employee>();
		Employee ob1 = new Employee("neha");
		Employee ob2 = new Employee("aman");
		emp.add(ob1);
		emp.add(ob2);
		
		emp.forEach(x->System.out.println(x));
		emp.sort((Employee e,Employee e2)->e.getName().compareTo(e2.getName()));
		emp.forEach(x->System.out.println(x));

		// OR you can use below
		// employees.sort(Comparator.comparing(Employee::getFirstName));
		// emp.stream().sorted((Employee e,employee e2)->e1.name.co)
		/*
		 * emp.add(new Employee("aman")); emp.add(new Employee("rekha")); emp.add(new
		 * Employee("bheem")); emp.add(new Employee("bhaskar")); emp.add(new
		 * Employee("verain")); emp.add(new Employee("chintu"));
		 */

		//System.out.println(emp);
		// Collections.sort(emp,new NameSorter());
		// System.out.println(emp);
		// Collections.sort((List<T>) emp);
		// emp.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
		// emp.sort(Comparator.comparing(e->e.));
		// System.out.println(emp);
		// (a,b)->a.compareTo(b)
		/*
		 * // It works perfect !! List<String> strings = Stream.of("how", "to", "do",
		 * "in", "java").collect(Collectors.toList()); System.out.println(strings); //
		 * strings.forEach(x -> System.out.println(x)); Optional<Integer> intList =
		 * IntStream.of(1, 2, 2, 4, 45, 5, 6).boxed().max(Integer::compareTo);
		 * System.out.println(intList); // intList.forEach(x -> System.out.println(x));
		 */ }
}
