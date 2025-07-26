package com.lambdaExpression;
@FunctionalInterface
public interface I3 {
	int getStringLength(String str);
	default void m1()
	{
		System.out.println("Hello");
	}
}
