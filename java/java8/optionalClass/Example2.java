package com.optionalClass;

import java.util.Optional;

public class Example2 {
	
		private static Optional<String> getName(int id)
		{
			return Optional.empty();
		}
		
		public static void main(String[] args) {
			Optional<String> name = getName(2);
			String name2 = name.isPresent()?name.get():"NA";
			System.out.println(name2);
			//Instead of writing this use orElse()
			
			String name3 = name.orElse("NA");
			System.out.println(name3);
			
		}
	}
