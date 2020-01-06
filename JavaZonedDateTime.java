import java.time.*;
public class JavaZonedDateTime 
{
	public static void main(String[] args) 
	{
		ZonedDateTime zone=ZonedDateTime.parse("2020-01-03T10:00:10+05:30[Asia/Kolkata]");
		System.out.println(zone);
		LocalDateTime ldt=LocalDateTime.of(2020,Month.JANUARY,03,10,26);
		ZoneId india=ZoneId.of("Asia/Kolkata");
		ZonedDateTime zone1=ZonedDateTime.of(ldt, india);
		System.out.println("In India Central Time Zone: "+zone1);
		ZoneId tokyo=ZoneId.of("Asia/Tokyo");
		ZonedDateTime zone2=zone1.withZoneSameInstant(tokyo);
		System.out.println("In Tokyo Central Time Zone: "+zone2);
		ZonedDateTime zone3=ZonedDateTime.now();
		System.out.println(zone3.getZone());
		ZonedDateTime m=zone3.minus(Period.ofDays(126));
		System.out.println(m);	
		ZonedDateTime p=zone3.plus(Period.ofDays(126));
		System.out.println(p);
	}

}
