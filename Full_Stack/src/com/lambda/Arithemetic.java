package com.lambda;
import java.util.function.*;
@FunctionalInterface
interface Operations<T>{
	int fun(int a , int b);	
}
public class Arithemetic { 
	public static void main(String[] args) {
		
		Operations<Integer> addition = ( a ,  b) -> (a+b);
		System.out.println(addition.fun(5, 4));
		Operations<Integer> sub = ( a ,  b) -> (a-b);
		System.out.println(sub.fun(5, 4));
		Operations<Integer> mul = ( a ,  b) -> (a*b);
		System.out.println(mul.fun(5, 4));
		Operations<Integer> div = ( a ,  b) -> (a/b);
		System.out.println(div.fun(5, 4));
	}

}
