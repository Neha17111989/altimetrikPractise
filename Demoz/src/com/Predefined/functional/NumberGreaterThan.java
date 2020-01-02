package com.Predefined.functional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class NumberGreaterThan {

	public static void main(String[] args) {
		/*
		 * Predicate<Integer> p=(Integer x)->{ if(x>10) { return true; } return false;
		 * };
		 */
		Predicate<Integer> p=i->i>10;
		if(p.test(114)) {
			System.out.println("greater than 10");
		}
		else {
			System.out.println("NOT");
		}
		Predicate<String> str=i->i.length()>10;
		if(str.test("nehamehta-veermavi"))
		{
			System.out.println("yes ,length is greater than 10");
		}
		else {
			System.out.println("no ,length is greater than 10");
		}
		Predicate<Collection> p2=c->c.isEmpty();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		if(p2.test(arr))
		{
			System.out.println("yes its empty");
		}
		else{
			System.out.println("no , its not empty");
		}
		
		Predicate<Integer> p3=i->i%2==0;
		System.out.println(p3.test(3));
		System.out.println(p3.negate().test(3));
		Predicate p4=p3.or(p.negate());
		System.out.println(p4.test(20));
	}

}
