package com.methodRefrences;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void print(String s)
	{
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		List<String> students = new ArrayList<String>();
		students.add("Alice");
		students.add("Bob");
		students.add("Charlie");
		System.out.println(students);
		
		//OR we can use
		students.forEach(x -> System.out.println(x));
		
		//So we use method referece here Test is the classname and print is the method name to be called.
		students.forEach(Test :: print);
		
		//Here we dont call the method we just give the reference 
		//But the method should be present in the class
	}
}
