package com.optionalClass;

import java.util.Optional;

public class Example1 {
	private static Optional<String> getName(int id)
	{
		String name = null;
		return Optional.ofNullable(name);
	}
	
	public static void main(String[] args) {
		Optional<String> name = getName(2);
		name.ifPresent(x -> System.out.println(x));
		System.out.println("Hello");
		
	}
}
