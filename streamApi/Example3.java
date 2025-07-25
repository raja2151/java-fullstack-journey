package com.streamApi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example3 {
	public static void main(String[] args) {
	   List<Integer> s = Stream.iterate(0, x -> x+1).limit(101).filter(x -> x%10 == 0).distinct().sorted((a,b) -> b-a).skip(1).collect(Collectors.toList());
	   System.out.println(s);
	   
	  Integer l =  s.stream().max((a,b) -> b-a).get();
	   System.out.println(l);
	   
		  Long l1 =  s.stream().count();
		   System.out.println(l1);
	}
}
