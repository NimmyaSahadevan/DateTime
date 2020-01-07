import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class CaseStudyDateTime1_Bookrooms 
{
	static Scanner ob = new Scanner(System.in);
	public static void main(String [] arg) throws ParseException
	{
		int id;
		String name,address,mob,pt,pno,ac,cot,cable,wifi,laundry;
		int op2;
		String date;
		int r=0,b=0,rid=2050,bid=2001,roomid=1;
		int d1,d2;
		CaseStudyDateTime1_Register re[]=new CaseStudyDateTime1_Register [20];
		CaseStudyDateTime1_Booking bo[]=new CaseStudyDateTime1_Booking[20];
		String op;
		do
		{
			System.out.println("1.Booking\n2.View Booking\n3.Exit");
			op2 = ob.nextInt();
			switch(op2)
			{
			case 1:
				System.out.print("Registration ");
				System.out.println("Enter Name : ");
				ob.nextLine();
				name=ob.nextLine();
				System.out.println("Enter Address : ");
				address=ob.nextLine();
				System.out.println("Enter Mobile Number : ");
				mob=ob.nextLine();
				System.out.println("Enter ID-Proof Type : ");
				pt=ob.nextLine();
				System.out.println("Enter ID-Proof Number : ");
				pno=ob.nextLine();
				re[r]=new CaseStudyDateTime1_Register ();
				int reid=re[r].registration(rid,name,address,mob,pt,pno);
				rid++;
				re[r].display();
				
				do
				{
					System.out.println("Please choose the services required\nAC/non-AC (AC/nAC) :");
					ac=ob.next();
					System.out.println("Cot(Single/Double) :");
					cot=ob.next();
					System.out.println("With cable connection/without cable connection(C/nC) :");
					cable=ob.next();
					System.out.println("Wi-Fi needed or not(W/nW) :");
					wifi=ob.next();
					System.out.println("Laundry service needed or not(L/nL) :");
					laundry=ob.next();
					System.out.println("Enter Booking date(dd/MM/yyyy)");
					date=ob.next();
				    DateTimeFormatter formatter2= DateTimeFormatter.ofPattern("dd/MM/yyyy");
					LocalDate date1=LocalDate.parse(date,formatter2);  
					bo[b]=new CaseStudyDateTime1_Booking();
					int bbid=bo[b].book(ac, cot, cable, wifi, laundry,date1,roomid,reid);
					b++;
					roomid++;
					System.out.println("Do you want to Book more Rooms(Yes/No):");
					op=ob.next();
				}while(op.equals("yes")||op.equals("Yes"));
					break;
			case 2:
					System.out.println("Enter Start Date:(dd/MM/yyyy)");
					String sdate=ob.next();
					DateTimeFormatter formatter3= DateTimeFormatter.ofPattern("dd/MM/yyyy");
					LocalDate d=LocalDate.parse(sdate,formatter3);  
					System.out.println("Enter End Date:(dd/MM/yyyy)");
					String sdate1=ob.next();
                    DateTimeFormatter formatter4= DateTimeFormatter.ofPattern("dd/MM/yyyy");
					LocalDate d0=LocalDate.parse(sdate1,formatter4);  
					System.out.println("            BOOKING DETAILS\n");
					System.out.println("Room NO\t\tCustomer id");
					for(int j=0;j<b;j++)
					{
						if((bo[j].date1.isAfter(d))&&(bo[j].date1.isBefore(d0)))
						{
							bo[j].view(d,d0);
						}
					}
					break;
			case 3:
					System.exit(0);
			}
			System.out.println("Do you want to proceed?(yes/no)");
			op=ob.next();
		}while(op.contentEquals("yes"));
	}
}



