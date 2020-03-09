package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier.*;

interface Supplier<T>{
	T get();
}
interface Consumer<T>{
	void accept (T t);
}
interface Predicate<T>{
	boolean test(T t);
}
interface Function<T , R>{
	R apply(T t);
}
public class Functions {
	private static void printM(Supplier<Integer> supply) {
		Integer mark=supply.get();
		int marks;
		if(marks>50) System.out.println("passed");
		else System.out.println("failed");
	}
	private static void printM1(List<Integer> asList, Consumer<Integer> consume) {
	
		
	}
	public static void main(String[] args) {
		Supplier<Integer> supply=()-> Random.nextInt(100);
		printM(supply);
		 
		Consumer<Integer> consume=(Integer x)->System.out.println(x);
		printM1(Arrays.asList(10, 15, 20, 44, 85), consume);
	}

	

}
