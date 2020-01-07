import java.util.Calendar;
public class JavaCalenderExample 
{

	public static void main(String[] args) 
	{
		Calendar calendar=Calendar.getInstance();
		System.out.println("The current date is : "+calendar.getTime()); //current date
		calendar.add(Calendar.DATE, -15);                                //add day with specified number of days
		System.out.println("15 days ago : "+calendar.getTime());  
		calendar.add(Calendar.MONTH,5);                                  //add month with specified number of months
		System.out.println("4 Months later : "+calendar.getTime());
		calendar.add(Calendar.YEAR,2);                                   //add year with specified number of years
		System.out.println("2 Years later : "+calendar.getTime());
		System.out.println("At present calendar's Year : "+calendar.get(Calendar.YEAR));  //present year
		System.out.println("At present calendar's Day : "+calendar.get(Calendar.DATE));  //present day
		System.out.println("At present date and time is : "+calendar.getTime());       //present date and time
		int maximum=calendar.getMaximum(Calendar.DAY_OF_WEEK);            //maximum no.of day in a week
		System.out.println("Maximum no.of days in a week : "+maximum);  
		maximum=calendar.getMaximum(Calendar.WEEK_OF_YEAR);               //maximum no.of week in a year
		System.out.println("Maximum no.of weeks in a year : "+maximum);
		int minimum=calendar.getMinimum(Calendar.DAY_OF_WEEK);          //minimum no.of day in a week
		System.out.println("Minimum no.of days in a week : "+minimum);
		maximum=calendar.getMinimum(Calendar.WEEK_OF_YEAR);             //minimum no.of week in a year
		System.out.println("Minimum no.of weeks in a year : "+minimum);
	}

}
