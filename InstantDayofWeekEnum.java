import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class InstantDayofWeekEnum 
{

	public static void main(String[] args) 
	{
		Instant inst=Instant.parse("2020-01-03T10:37:30.00Z");
		System.out.println(inst);
		Instant instant1=Instant.now();
		System.out.println(instant1);
		Instant instant=Instant.parse("2020-01-03T11:25:30.00Z");
		instant =instant.minus(Duration.ofDays(125));
		System.out.println(instant);
		Instant inst1=Instant.parse("2020-01-03T10:25:30.00Z");
		Instant inst2=inst1.plus(Duration.ofDays(125));
		System.out.println(inst2);
		System.out.println(inst.isSupported(ChronoUnit.DAYS));
		System.out.println(inst.isSupported(ChronoUnit.YEARS));
		LocalDate localdate=LocalDate.of(2020, Month.JANUARY, 03);
		DayOfWeek dayOfWeek=DayOfWeek.from(localdate);
		System.out.println(dayOfWeek.get(ChronoField.DAY_OF_WEEK));
		DayOfWeek day1=DayOfWeek.of(5);
		System.out.println(day1.name());
		System.out.println(day1.ordinal());
		System.out.println(day1.getValue());
		LocalDate date=LocalDate.of(2020, Month.JANUARY, 03);
		DayOfWeek day2=DayOfWeek.from(date);
		System.out.println(day2.getValue());
		day2=day2.plus(3);
		System.out.println(day2.getValue());
		day2=day2.minus(3);
		System.out.println(day2.getValue());
		
	}

}
