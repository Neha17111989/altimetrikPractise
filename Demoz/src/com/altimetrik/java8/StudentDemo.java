package com.altimetrik.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StudentDemo {

	public static void main(String[] args) {
		List<Student> listOfStudents = new ArrayList<Student>();

		listOfStudents.add(new Student(111, "John", 81.0, "Mathematics"));

		listOfStudents.add(new Student(222, "Harsha", 79.5, "History"));

		listOfStudents.add(new Student(333, "Ruth", 87.2, "Computers"));

		listOfStudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));

		listOfStudents.add(new Student(555, "Zade", 83.5, "Computers"));

		listOfStudents.add(new Student(666, "Xing", 58.5, "Geography"));

		listOfStudents.add(new Student(777, "Richards", 72.6, "Banking"));

		listOfStudents.add(new Student(888, "Sunil", 86.7, "History"));

		listOfStudents.add(new Student(999, "Jordan", 58.6, "Finance"));

		listOfStudents.add(new Student(101010, "Chris", 89.8, "Computers"));

		List<Student> listOfStudents2 = listOfStudents.stream().filter(x -> x.getSpecialization().equals("Mathematics"))
				.collect(Collectors.toList());
		listOfStudents2.forEach(System.out::println);

		// List<Student>
		// listOfStudents3=listOfStudents.stream().filter(x->x.getPercentage()>0).distinct().collect(Collectors.toList());
		Consumer<Student> con = (Student s) -> {
			System.out.println(s.getName()+": "+s.getPercentage());
		};
		for (Student student : listOfStudents) 
		{
			con.accept(student);
		}
		System.out.println("----");
		
		Supplier<Student> studentSupplier = () -> new Student(111111, "New Student", 92.9, "Java 8");
        
		listOfStudents.add(studentSupplier.get());
	}

}
