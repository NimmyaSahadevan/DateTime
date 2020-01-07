import java.sql.Date;

public class JavaSqlDateExample 
{
	public static void main(String[] args) 
	{
		long millis=System.currentTimeMillis();
		java.sql.Date date1=new java.sql.Date(millis);
		System.out.println(date1);
		String str="2015-03-31";
		Date date2=Date.valueOf(str); //converting string into sql date
		System.out.println(date2);
	}

}
