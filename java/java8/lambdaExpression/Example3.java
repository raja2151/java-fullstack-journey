package com.lambdaExpression;

public class Example3 implements I3 {
	public static void main(String[] args) {
		System.out.println("Main Method");
		I3 i = str -> str.length();
		System.out.println(i.getStringLength("Hello World"));
		I3 q = new Example3();
		q.m1();
	}

	@Override
	public int getStringLength(String str) {
		// TODO Auto-generated method stub
		return 0;
	}
}
