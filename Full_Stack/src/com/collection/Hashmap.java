package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Date{
	
	private int date;
	private int month;
	private int year;
	public Date(int date, int month, int year) {
	
		this.date = date;
		this.month = month;
		this.year = year;
	}
	
			public int getDate() {
				return date;
			}
			public void setDate(int date) {
				this.date = date;
			}
			public int getMonth() {
				return month;
			}
			public void setMonth(int month) {
				this.month = month;
			}
			public int getYear() {
				return year;
			}
			public void setYear(int year) {
				this.year = year;
			}
	
	
	
	@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + date;
				result = prime * result + month;
			
				return result;
			}

			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Date other = (Date) obj;
				if (date != other.date)
					return false;
				if (month != other.month)
					return false;
				
				return true;
			}

	@Override
	public String toString() {
		return "Dob is [date=" + date + ", month=" + month + ", year=" + year + "]";
	}
	
}
public class Hashmap {
	

	public static void main(String[] args) {
		
		HashMap<Date, String> m=new HashMap<Date ,String >();
		m.put(new Date(3,12, 2020), "abc");
		m.put(new Date (3,12,1997),"Ravi");
		m.put(new Date(5,12,2020),"ANKIT");
		Iterator<Date> m1 = m.keySet().iterator();
		while(m1.hasNext()) {
			Date name = m1.next();
			System.out.println(name);
		
		}
				System.out.println(m.get(new Date (3,12,1997)));
	}
	

}
