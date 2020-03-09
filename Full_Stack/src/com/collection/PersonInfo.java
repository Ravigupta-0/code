
package com.collection;


import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person>{
		double weight;
		double height;
		String name;
	
	public Person(double weight, double height, String name) {
		
			this.weight = weight;
			this.height = height;
			this.name = name;
		}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Person ab) {
		if(this.weight > ab.weight) {
			return 1;
		}
		else if (this.weight < ab.weight){
			return -1;
		}
		else if (this.weight == ab.weight) {
			if(this.height > ab.height ) {
				return 1;
			}
			else if(this.height < ab.height) {
				return -1;
			}
			else  return 0;
		}
		else return 0;
	}

	@Override
	public String toString() {
		return "Person [weight=" + weight + ", height=" + height + ", name=" + name + "]";
	}
	
	
}
public class PersonInfo {

	public static void main(String[] args) {
		
		TreeSet<Person> t=new TreeSet<Person>();
		t.add(new Person(42.3, 7.2, "Ravi"));
		t.add(new Person(78.2, 6.2, "Anuj"));
		t.add(new Person(87.2, 5.2, "alok"));
		t.add(new Person(78.3, 8.2, "asit"));
		t.add(new Person(99.3, 5.2, "abhishek"));
		t.add(new Person(42.3, 6.2, "yash"));
		
		Iterator<Person> itr = t.iterator();
		while(itr.hasNext()) {
			Person a = itr.next();
			System.out.println(a);
		}
	}

}
