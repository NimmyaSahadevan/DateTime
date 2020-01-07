import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;

public class JavaZoneOffsetExample 
{
	public static void main(String[] args) 
	{
		ZoneOffset zone1=ZoneOffset.UTC;  // amount of time that a time-zone differs from Greenwich/UTC
		Temporal temp=zone1.adjustInto(ZonedDateTime.now());//current date-time with a time-zone 
		System.out.println(temp);
		ZoneOffset zone2=ZoneOffset.ofHours(5);//Obtains an instance of ZoneOffset using an offset in hours.
		System.out.println(zone2);
		ZoneOffset zone3=ZoneOffset.ofHoursMinutes(5,30);//Obtains an instance of ZoneOffset using an offset in hours and minutes.
		System.out.println(zone3);
		boolean b1=zone1.isSupported(ChronoField.OFFSET_SECONDS); //checks if this offset can be queried for the specified field
		System.out.println(b1);
		boolean b2=zone1.isSupported(ChronoField.SECOND_OF_MINUTE);
		System.out.println(b2);
	}

}
