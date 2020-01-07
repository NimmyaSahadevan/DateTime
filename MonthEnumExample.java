import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;

public class MonthEnumExample
{

	public static void main(String[] args) 
	{
		Month month=Month.valueOf("January".toUpperCase());
		System.out.printf("For the month of %s all sunday are:%n",month);
		LocalDate localdate=Year.now().atMonth(month).atDay(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
		Month mi=localdate.getMonth();
		while(mi==month)
		{
			System.out.printf("%s%n",localdate);
			localdate=localdate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
			mi=localdate.getMonth();
		}
		Month month1=Month.from(LocalDate.now());
		System.out.println(month1.getValue());
		System.out.println(month1.name());
		System.out.println(month1.minus(2));
		System.out.println(month1.plus(2));
		System.out.println("Total Number of Days: "+month.length(true));
	}

}
