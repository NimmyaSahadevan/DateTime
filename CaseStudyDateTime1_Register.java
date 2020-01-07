
public class CaseStudyDateTime1_Register 
{
	int id;
	String name,address,mob,pt,pno;
	int registration(int id,String name,String address,String mob,String pt,String pno)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.mob=mob;
		this.pt=pt;
		this.pno=pno;
		return this.id;
	}
	void display()
	{
		System.out.println("Your details are as follows\nName:"+this.name
						+"\nAddress: "+this.address+"\nContact Number: "+this.mob
						+"\nProof type: "+this.pt+"\nProof id: "+this.pno
						+"\nYour Registration ID: "+this.id);
	}
}






