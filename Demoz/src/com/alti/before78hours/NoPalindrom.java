package com.alti.before78hours;

public class NoPalindrom {

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	public static void main(String[] args) {
		int x=121;int revese=0,remainder;
		int y=x;
		while(x!=0) {
			remainder=x%10;
			System.out.println("remainder "+remainder);
			revese=revese*10+remainder;
			x=x/10;
			
		}

		if(revese==y) {
			System.out.println("yes ");
		}
		else
			System.out.println("NO");
	}

}
