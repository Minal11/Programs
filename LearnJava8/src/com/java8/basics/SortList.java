package com.java8.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		System.out.println("String List");
		List<String> names=Arrays.asList("beta","gamma","alpha" );
		System.out.println("Before:"+names);
		Collections.sort(names,(a,b)->a.compareTo(b));
		System.out.println("After ascending:"+names);
		Collections.sort(names,(a,b)->b.compareTo(a));
		System.out.println("After descending:"+names);
		
		System.out.println("Integer List");
		List<Integer> numbers=Arrays.asList(13,433,-9);
		System.out.println("Before:"+numbers);
		Collections.sort(numbers,(a,b)->a.compareTo(b));
		System.out.println("After ascending:"+numbers);
		Collections.sort(numbers,(a,b)->b.compareTo(a));
		System.out.println("After descending:"+numbers);
		
		System.out.println("Long List");
		List<Long> numberLong=Arrays.asList(13L,433L,-9L);
		System.out.println("Before:"+numberLong);
		Collections.sort(numberLong,(a,b)->a.compareTo(b));
		System.out.println("After ascending:"+numberLong);
		Collections.sort(numberLong,(a,b)->b.compareTo(a));
		System.out.println("After descending:"+numberLong);
		
		System.out.println("Double List");
		List<Double> numberDouble=Arrays.asList(13.0,43.0,-9.0);
		System.out.println("Before:"+numberDouble);
		Collections.sort(numberDouble,(a,b)->a.compareTo(b));
		System.out.println("After ascending:"+numberDouble);
		Collections.sort(numberDouble,(a,b)->b.compareTo(a));
		System.out.println("After descending:"+numberDouble);
	}

	

}
