package com.lambdaExpression;

public interface I4 {
	void abc();
	default void sayBye()
	{
		System.out.println("Byee Byee");
	}
	default void sayNo()
	{
		System.out.println("Noo");
	}
}
