package com.Date;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Day15th2 {

	public static void main(String[] args) {
		LocalDate dt=LocalDate.now();
		System.out.println(dt);
		int nextday=dt.get(ChronoField.DAY_OF_MONTH)+15;
		System.out.println(nextday);

	}

}
