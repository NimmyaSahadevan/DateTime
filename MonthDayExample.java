import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;
public class MonthDayExample 
{
	public static void main(String[] args) 
	{
		
		MonthDay month=MonthDay.now(); //Current date and month
		LocalDate date=month.atYear(2019); //combines month with given year
		System.out.println(date);
		boolean a=month.isValidYear(2018); //checks whether month is valid or not in specified date
		System.out.println(a);
		long b=month.get(ChronoField.MONTH_OF_YEAR); // returns month within a year
		System.out.println(b);
		ValueRange r1=month.range(ChronoField.MONTH_OF_YEAR); //range of months in a year
		System.out.println(r1);
		ValueRange r2=month.range(ChronoField.DAY_OF_MONTH); // range of days in a month
		System.out.println(r2);
	}
}
