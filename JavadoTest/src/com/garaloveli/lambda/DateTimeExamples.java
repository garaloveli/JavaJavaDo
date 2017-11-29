package com.garaloveli.lambda;

import java.time.Month;
import java.time.LocalDate;

public class DateTimeExamples {
	public static void p(Object c) {
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		p(now);
		
		LocalDate hireDate = LocalDate.of(2008, Month.APRIL, 21);
		p(hireDate);
		
		LocalDate aWeekFromNow = now.plusWeeks(1);
		p(aWeekFromNow);
		
		LocalDate aWeekAgo = now.minusWeeks(1);
		p(aWeekAgo);
		
		System.out.println(hireDate.isBefore(now));
	}
}
