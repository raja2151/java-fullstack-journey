package com.lambdaExpression;

public class Example2 {
	public static void main(String[] args) {
		System.out.println("Main Method");
		I2 i = (int a,int b) -> {return (a+b);};
		System.out.println(i.add(2, 4));
	}
}
