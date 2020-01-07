import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class JavaYearExample 
{
	public static void main(String[] args) 
	{
		Year y1=Year.now();      //current year
		System.out.println(y1);
		Year y2=Year.of(2020);   //Specified year
		LocalDate l=y2.atDay(100);
		System.out.println(l);      // Specified day in specified year
		System.out.println(y2.length()); // length of year
		System.out.println(y2.isLeap()); //checks whether leap year or not
		YearMonth ym=YearMonth.now();    //current year and month
		System.out.println(ym);
		String s=ym.format(DateTimeFormatter.ofPattern("MM yyyy")); // current year and month in given format
		System.out.println(s);
		long l1=ym.get(ChronoField.YEAR);  //current year
		System.out.println(l1);
		long l2=ym.get(ChronoField.MONTH_OF_YEAR); //current month
		System.out.println(l2);
		YearMonth ym2=ym.plus(Period.ofYears(2));  //adding specified number of years
		System.out.println(ym2);
		YearMonth ym3=ym.minus(Period.ofYears(2));  //subtracting specified number of years
		System.out.println(ym3);
	}

}
