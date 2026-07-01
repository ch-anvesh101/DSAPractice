package Collections;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeDemo {

	public static void main(String[] args) {
	LocalTime time= LocalTime.now();
	System.out.println(time);
	
	time.getHour();
	time.getMinute();
	
	LocalDate dt=LocalDate.now();
	System.out.println(dt.getMonthValue());
	dt.getDayOfMonth();
	
	LocalDateTime Id=LocalDateTime.now();
	Id.getDayOfMonth();

	}

}
