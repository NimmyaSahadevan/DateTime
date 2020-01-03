import java.time.LocalTime;
public class TimeExample_1
{
	public static void main(String[] args) 
	{
		//Current Time
		LocalTime localtime=LocalTime.now();
		System.out.println(localtime);
		
		//Specific Time
		LocalTime localtime2=LocalTime.of(4,30,45);
		System.out.println(localtime2);
		System.out.println("Hour : "+localtime.getHour());
		System.out.println("Minute : "+localtime.getMinute());
		System.out.println("Second : "+localtime.getSecond());
		
		//LocalTimes's plus methods
		System.out.println("Addition of Hours : "+localtime.plusHours(2));
		System.out.println("Addition of Minutes : "+localtime.plusMinutes(25));
		System.out.println("Addition of Seconds : "+localtime.plusSeconds(120));
		System.out.println("Addition of Nanos : "+localtime.plusNanos(60000));
		
		//LocalTimes's minus methods
		System.out.println("Subtraction of Hours : "+localtime.minusHours(2));
		System.out.println("Subtraction of Minutes : "+localtime.minusMinutes(25));
		System.out.println("Subtraction of Seconds : "+localtime.minusSeconds(120));
		System.out.println("Subtraction of Nanos : "+localtime.minusNanos(60000));
		
		LocalTime localtime3=LocalTime.of(12,45,20);
		
		//compareTo() example
		if(localtime.compareTo(localtime2)==0)
		{
			System.out.println("localtime1 and localtime2 are equal");
		}
		else
		{
			System.out.println("localtime1 and localtime2 are not equal");
		}
		
		//isBefore() example
		if(localtime2.isBefore(localtime3))
		{
			System.out.println("localtime2 comes before localtime3");
		}
		
		//isAfter() example
		if(localtime3.isAfter(localtime))
		{
			System.out.println("localtime3 comes after localtime1");
		}
	}
}
