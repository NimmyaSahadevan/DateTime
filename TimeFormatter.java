import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class TimeFormatter 
{

	public static void main(String[] args)
	{
		LocalTime localtime =LocalTime.now();
		//ISO Format
		DateTimeFormatter timeformatter=DateTimeFormatter.ISO_LOCAL_TIME;
		System.out.println(localtime.format(timeformatter));
		
		//hour-of-day (0-23)
		DateTimeFormatter timeformatter2=DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println(localtime.format(timeformatter2));
		
		//clock-hour-of-am-pm (1-24)
		DateTimeFormatter timeformatter3=DateTimeFormatter.ofPattern("kk:mm:ss");
		System.out.println(localtime.format(timeformatter3));
		
		//clock-hour-of-am-pm (1-12)
		DateTimeFormatter timeformatter4=DateTimeFormatter.ofPattern("hh:mm:ss a");
		System.out.println(localtime.format(timeformatter4));
		
		//hour-of-am-pm (0-11)
		DateTimeFormatter timeformatter5=DateTimeFormatter.ofPattern("hh:mm:ss a");
		System.out.println(localtime.format(timeformatter5));
		ZoneId zone1=ZoneId.of("Asia/Kolkata");
		ZoneId zone2=ZoneId.of("Asia/Tokyo");
		LocalTime time1= LocalTime.now(zone1);
		System.out.println("India Time Zone: "+time1);
		LocalTime time2= LocalTime.now(zone2);
		System.out.println("Japan Time Zone: "+time2);
		long hours= ChronoUnit.HOURS.between(time1, time2);
		System.out.println("Hours between two Time Zone: "+hours);
		long minutes= ChronoUnit.MINUTES.between(time1, time2);
		System.out.println("Minutes between two Time Zone: "+minutes);
		long seconds= ChronoUnit.SECONDS.between(time1, time2);
		System.out.println("Seconds between two Time Zone: "+seconds);
	}

}
