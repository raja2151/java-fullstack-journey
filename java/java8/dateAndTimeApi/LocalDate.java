package com.dateAndTimeApi;

import java.time.Month;

public class LocalDate {
	public static void main(String[] args) {
	    java.time.LocalDate ld = java.time.LocalDate.now();
	    System.out.println(ld);
	    java.time.LocalDate myDate = java.time.LocalDate.of(2003, 4, 16);
	    System.out.println(myDate);    
	    Integer i = ld.getDayOfMonth();
	    System.out.println(i);
	    Month j = ld.getMonth();
	    System.out.println(j);
	    Integer k = ld.getYear();
	    java.time.LocalDate l = ld.minusDays(5);
	    System.out.println(l);
	}
}
