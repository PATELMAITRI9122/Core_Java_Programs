package date_time_api;

import java.time.LocalDate;
import java.time.Period;

public class Demo4 {
	
	public static void main(String[] args) {
		
		LocalDate birthday = LocalDate.of(1997, 10, 27);
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthday, today);
		
		System.out.printf("Your age is %d years %d Month and %d Days", p.getYears(),p.getMonths(),p.getDays());
		
		LocalDate deathDay = LocalDate.of(1989+60,8,28);
		Period p2 = Period.between(today, deathDay);
		
		int d = p2.getYears() * 365 + p2.getMonths() * 30 + p2.getDays();
		System.out.printf("\n you will be on death only %d Days, Hurry up to do more important things", d);
		
	}

}
