import java.time.OffsetDateTime;

public class JavaOffsetDateTimeExample 
{
	public static void main(String[] args) 
	{
		OffsetDateTime offsetDT=OffsetDateTime.now(); //current date and time
		System.out.println(offsetDT.getDayOfMonth()); //current day of month
		System.out.println(offsetDT.getDayOfYear());  //current day of year
		System.out.println(offsetDT.getDayOfWeek());  //current day of week
		System.out.println(offsetDT.toLocalDate());   // current date
		OffsetDateTime value1=offsetDT.minusDays(240); //date and time before specified days
		System.out.println(value1);
		OffsetDateTime value2=offsetDT.plusDays(240);  //date and time after specified days
		System.out.println(value2);
	}
}
