package com.altimetrik;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;

public class JODA_API {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now(Clock.systemUTC());
		System.out.println(date.getChronology());
		Month s=date.getMonth();
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println("complete data "+ldt);
		System.out.println("only date "+ldt.getDayOfMonth());
		System.out.println("Add next ten years to current date ");
		LocalDateTime ll=ldt.plus(10, ChronoUnit.YEARS);
		System.out.println("Added next 10 Years "+ll);
		System.out.println(ll.getDayOfWeek());
		
		 //Get the current date
	      LocalDate date1 = LocalDate.now();
	      System.out.println("Current date: " + date1);
			
	      //get the next tuesday
	      LocalDate nextTuesday = date1.with(TemporalAdjusters.previous(DayOfWeek.TUESDAY));
	      System.out.println("Next Tuesday on : " + nextTuesday);
			
	      System.out.println(nextTuesday.with(TemporalAdjusters.previous(DayOfWeek.TUESDAY)));
	      //get the second saturday of next month
	      LocalDate firstInYear = LocalDate.of(date1.getYear(),date1.getMonth(), 29);
	      System.out.println("firstInYear "+firstInYear);
	      LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(
	         DayOfWeek.SATURDAY)).with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
	      System.out.println("Second Saturday on : " + secondSaturday);
	      
	      
	      LocalDateTime date2 = ll.withDayOfMonth(10).withYear(2012);
	      System.out.println("date2: " + date2.getDayOfWeek());

	}

}
