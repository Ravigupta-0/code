package com.Date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class Zone {

	public static void main(String[] args) {
		LocalTime l=LocalTime.now();
		ZoneId indian=ZoneId.of("Asia/Kolkata");
		ZoneId romeanian=ZoneId.of("Europe/Rome");
		LocalTime l1=LocalTime.now(indian);
		LocalTime l2=LocalTime.now(romeanian);
		System.out.println(l);
		System.out.println(l1);
		System.out.println(l2);
	}

}
