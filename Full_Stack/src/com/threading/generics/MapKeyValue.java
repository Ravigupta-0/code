package com.threading.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class MapKeyValue {
	public static void printMapKeyValues(HashMap<? extends Number,?> hmap) {
		Iterator<?> i=hmap.keySet().iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	public static void main(String[] args) {
	
		HashMap<Integer, String> h = new HashMap();
		h.put(1,"hello");
		h.put(2, "hi");
		printMapKeyValues(h);
	}

	
}

