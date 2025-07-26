package com.dateAndTimeApi;

public class LocalTime {
		public static void main(String[] args) {
			
		    java.time.LocalTime ld = java.time.LocalTime.now();
		    System.out.println(ld);
		    java.time.LocalTime myDate = java.time.LocalTime.of(10, 32);
		    System.out.println(myDate);    
		    Integer i = ld.getMinute();
		    System.out.println(i);
		    Integer j = ld.getHour();
		    System.out.println(j);
		    Integer k = ld.getNano();
		    java.time.LocalTime l = ld.minusMinutes(2);
		    System.out.println(l);
		}
	}


