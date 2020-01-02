package com.alti.before78hours;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Q3_IteratingMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(2, "Saket");

		map.put(25, "Saurav");

		map.put(12, "HashMap");

		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}
	
		Iterator itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry key=(Entry) itr.next();
			System.out.println(key.getKey()+" "+key.getValue());
			
			
		}

	}
}
