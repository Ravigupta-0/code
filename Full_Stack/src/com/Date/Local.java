package com.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Local {

	public static void main(String[] args) {
		LocalDate l=LocalDate.now();
		DateTimeFormatter italianFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.ITALIAN);
		String f=l.format(italianFormatter);
		System.out.println(f);
	}

}
