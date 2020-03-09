package com.collection;
import java.util.HashMap;
import java.util.Iterator;

class Employee1 {
	private int id;
	

	public Employee1(int id) {
		this.id=id;
	}

	

	public int getId() {
		return id; 
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		return 4;
	}

	@Override
	public boolean equals(Object obj) {

		return true;
	}



	/*
	 * @Override public String toString() { return "Employee1 [id=" + id + "]"; }
	 */


}
public class Employee {

	public static void main(String[] args) {
		
		HashMap<Employee1, String> m=new HashMap<Employee1,String>();
		m.put(new Employee1(1),"ravi");
		m.put(new Employee1 (2),"skjgh");
		m.put(new Employee1(3),"iusyegf");
		
		Iterator<Employee1> i=m.keySet().iterator();
		while (i.hasNext()) {
			Employee1 name=i.next();
			System.out.println(name);
		}
		System.out.println(m.get(new Employee1(3)));
	}

}
