//Lambda Expression - It is an method with no name.
//1. Not having any name.
//2. Not having any return type
//3. Not having any modifier

package com.lambdaExpression;

public class Test {
	public void sayHello()
	{
		System.out.println("Hello");
	}
	
//	We need to convert this method to lambda expression
//	Steps
//		1. Remove Modifier(public,private,etc)
//		2. Remove Return Type(void,int,etc)
//		3. Remove Method Name
//		4. Place Arrow
	
	public static void main(String[] args) {
		System.out.println("This is Main Method");
		I1 i = () -> {System.out.println("Hello i am lambda");};
		i.hello();
	}
}
