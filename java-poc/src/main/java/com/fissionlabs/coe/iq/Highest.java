package com.fissionlabs.coe.iq;

import java.util.Arrays;
import java.util.List;

public class Highest extends Throwable{

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
       
		numbers.stream().max(Integer::compare).get();
		numbers.stream().min(Integer::compare).get();
	}
}
