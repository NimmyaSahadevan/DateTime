import java.util.TimeZone;
import java.util.*;
public class JavaTimeZoneExample 
{

	public static void main(String[] args) 
	{
		String[] id=TimeZone.getAvailableIDs();  //ID's available in timezone
		System.out.println("In the Timezone class available Ids are : ");
		for(int i=0;i<id.length;i++)
		{
			System.out.println(id[i]);
		}
		TimeZone zone=TimeZone.getTimeZone("Asia/Kolkata");
		System.out.println("The offset value of timezone:"+zone.getOffset(Calendar.ZONE_OFFSET)); //Offset value of timezone-Asia/Kolkata
		System.out.println("Value of Id is : "+zone.getID());  //ID of timezone-Asia/Kolkata
		TimeZone zone1=TimeZone.getDefault();  //Default timezone
		String name=zone1.getDisplayName();    //name of default timezone
		System.out.println("Display name for default time zone : "+name);
	}

}
