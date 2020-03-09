package com.Date;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Time12 {

	public static void main(String[] args) {
		
		LocalTime dt=LocalTime.now();
		System.out.println(dt); 
		  Duration d1=Duration.between(dt,LocalTime.NOON); 
		 if(d1.toHours()<24 ) {
			 d1=d1.plusHours(24);
			 
		 }
		  System.out.println(d1);
	}

}
