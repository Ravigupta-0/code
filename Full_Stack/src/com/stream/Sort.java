package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class Sort {

	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("hi");
		l.add("hello");
		l.add("Ravi");
		l.add("ajay");
		l.stream().filter((String name) -> name.startsWith("a"));
		

	}

}
