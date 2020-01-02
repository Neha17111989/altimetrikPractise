package com.altimetrik;

import java.util.Collections;
import java.util.*;

class Product {
	int pid;
	String pname;

	public Product(int pid, String pname, float price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	float price;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}

public class LamdaComparator {
	public static void main(String[] args) {
		Product p=new Product(101, "iphone", 22.00f);
		Product p2=new Product(102, "samsung", 27.00f);
		Product p3=new Product(103, "pro", 66.00f);
		Product p4=new Product(104, "4s", 10.00f);
		List<Product> plist=new ArrayList();
		plist.add(p);
		plist.add(p2);
		plist.add(p3);
		plist.add(p4);
		Collections.sort(plist, (x,y)->x.pname.compareTo(y.pname));
		//plist.forEach(System.out::println);
		plist.forEach(x->System.out.println(x.pname+" : "+x.pid+" : "+x.price));
	}

}
