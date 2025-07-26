package com.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example1 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Hello");
		l.add("Bye");
		l.add("Good");
		System.out.println(l);
		//Now convert it to streamApi
		Stream<String> stream = l.stream();
		
		String [] str = {"Raj","Patil"};
		//Convert Array to Stream
		Stream<String> s = Arrays.stream(str);
        
		//To create Stream of integers
		Stream<Integer> st = Stream.of(1,2,3,4);
		
		//Loops using Stream
		Stream<Integer> ste = Stream.iterate(0, x -> x+1).limit(100);
		ste.forEach(x -> System.out.println(x));
		
		//To generate Random number
		Stream<Integer> si = Stream.generate(() -> (int)(Math.random()*100)).limit(1);
		si.forEach(x -> System.out.println(x));
	}
}
