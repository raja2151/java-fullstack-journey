package com.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Rushikesh");
		l.add("Raj");
		l.add("Gaurav");
		l.add("Ketan");
		
		List<String> updated =  l.stream().filter(x -> x.startsWith("R")).map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println(updated);
	}
}
