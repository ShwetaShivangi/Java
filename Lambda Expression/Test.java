package com.practice.java;
import java.util.ArrayList;

// a class to test lambda function
class Test{
	
	public static void main(String[] args) {
		
		/*FuncInterface obj = (int x)->System.out.println(2*x);
		
		obj.abstractFunc(5);*/
		
		ArrayList al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		al.forEach(n-> System.out.println(n));
	}
}


