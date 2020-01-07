import java.util.*;
public class JavaUtilDateExample 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		Date mydate=new Date();
		System.out.println("System date : "+mydate.toString());
		mydate.setTime(15680);
		System.out.println("Time after setting : "+mydate.toString());
		int d=mydate.hashCode();
		System.out.println("Amount (in ms) by which time is shifted : "+d);
		Date date1=new Date(2020,01,06);
		Date date2=new Date(2019,12,25);
		boolean a=date2.after(date1);
		System.out.println("Is date2 is after date1 : "+a);
		a=date1.after(date2);
		System.out.println("Is date1 is after date2 : "+a);
		System.out.println("");
		Object date3=date1.clone();
		System.out.println("Cloned date3 : "+date3.toString());
		System.out.println("");
		boolean b=date2.before(date1);
		System.out.println("Is date2 is before date1 : "+b);
		Date d1=new Date(97,10,27);
		Date d2=new Date(97,6,12);
		int comparison=d1.compareTo(d2);   //d1>d2
		int comparison2=d2.compareTo(d1);  //d2>d2
		int comparison3=d1.compareTo(d1);  //d1=d2
		System.out.println("d1>d2:"+comparison);
		System.out.println("d1<d2:"+comparison2);
		System.out.println("d1=d2:"+comparison3);
		System.out.println("");
		boolean r1=d1.equals(d2);
		System.out.println("Result of equal() r1 : "+r1);
		boolean r2=d1.equals(d1);
		System.out.println("Result of equal() r2 : "+r2);
		System.out.println("");
		long count1=d1.getTime();
		long count2=d2.getTime();
		System.out.println("Milliseconds of d1 : "+count1);
		System.out.println("Milliseconds of d2 : "+count2);
		
	}
}
