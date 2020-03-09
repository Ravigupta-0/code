package com.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Formate {

	public static void main(String[] args) {
		LocalDate l=LocalDate.now();
		
		  System.out.println(l); 
		  DateTimeFormatter formate= DateTimeFormatter.ofPattern("dd/yyyy/MM"); 
		  String form=formate.format(l);
		 //  System.out.println(form);
		 
	}

}
