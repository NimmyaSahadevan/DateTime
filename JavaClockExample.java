import java.time.Clock;
import java.time.Duration;

public class JavaClockExample 
{
	public static void main(String[] args) 
	{
		Clock c1=Clock.systemDefaultZone(); 
		System.out.println(c1.getZone());   //Default time zone
		Clock c2=Clock.systemUTC();         // Universal Time Coordinator 
		System.out.println(c2.instant());  //time obtained by GMT(UK time)
		Duration d=Duration.ofHours(5);   
		Clock clock=Clock.offset(c2, d);  //adds specified hours with UTC
		System.out.println(clock.instant());

	}

}
