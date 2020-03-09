package com.Date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.Temporal;
import static java.time.temporal.TemporalAdjusters.*;


public class LeapDay {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		LocalTime localTime1 = LocalTime.of(16, 27, 10);
		int hour = localTime.getHour(); //16
		int minute = localTime.getMinute(); //27
		int second = localTime.getSecond(); //10
		LocalTime time = LocalTime.parse("15:15:20");
		System.out.println(LocalTime);
		System.out.println();
		System.out.println();
		System.out.println();
	}

}
