package com.zensar;
import java.time.LocalTime;
import java.time.Period;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.TimeZone;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Set;


public class DateAndTimeApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		LocalDateTime time=LocalDateTime.of(2020,12,5, 12,00);
//		time=time.plusMinutes(01);
//		System.out.println(time);
//		LocalDate date=LocalDate.of(1998, 12, 5);
//		Period period=Period.between(date,LocalDate.now());
//		System.out.println("Year"+period.getYears()+"month"+period.getMonths()+"days"+period.getDays());
		TimeZone tm=TimeZone.getTimeZone("America/Cuiaba");
		//ZoneId zone=ZoneId.of("America/Cuiaba");
	//	LocalTime time=LocalTime.of(zone);
	//	Calendar indiaTime = new GregorianCalendar(TimeZone.getDefault ("Asia/Singapore"));
	//	System.out.println(indiaTime);
		
	}

}
