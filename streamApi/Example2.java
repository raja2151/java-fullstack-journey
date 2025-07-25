package com.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example2 {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);	
		l.add(2);	
		l.add(3);
		l.add(4);	
		l.add(5);	
		l.add(6);	
		l.add(7);	
		l.add(4322);	
		l.add(9);	
		l.add(0);	
		l.add(5);	
		l.add(44);	
		l.add(23);	
		l.add(433);
		System.out.println(l);
		
		//Filter()
		Stream<Integer> streamList =  l.stream();
		List<Integer> filteredlist = streamList.filter(x -> x%2 == 0).collect(Collectors.toList());
		System.out.println(filteredlist);
		
		//map()
		Stream<Integer> streamList1 = filteredlist.stream();
		List<Integer> mappedlist = streamList1.map(x -> x/2).collect(Collectors.toList());
		System.out.println(mappedlist);
		
		//both together in one line
		Stream<Integer> streamListt =  l.stream();
		List<Integer> updated = streamListt.filter(x -> x%2 == 0).map(x -> x/2).collect(Collectors.toList());
		System.out.println(updated);
		
		l.add(4);
		l.add(44);
		l.add(433);
		System.out.println(l);
		
		//distinct()
		Stream<Integer> streamListtt =  l.stream();
		List<Integer> updatedd = streamListtt.filter(x -> x%2 == 0).map(x -> x/2).distinct().collect(Collectors.toList());
		System.out.println(updatedd);
		
		//sorted()
		Stream<Integer> streamListttt =  l.stream();
		List<Integer> updateddd = streamListttt.filter(x -> x%2 == 0).map(x -> x/2).distinct().sorted((a,b) -> b-a).collect(Collectors.toList());
		System.out.println(updateddd);
		
		//skip()
		Stream<Integer> streamListnew =  updateddd.stream();
		List<Integer> updatenew = streamListnew.skip(1).collect(Collectors.toList());
		System.out.println(updatenew);
	}
}
