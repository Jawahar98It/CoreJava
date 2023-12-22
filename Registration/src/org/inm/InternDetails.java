package org.inm;

public class InternDetails {
	String Name,DOB,email,Phone;
	String Address,Educ,Gen;
	
    void internName(String n)
	{
		System.out.println(n);
	}
 void internDOB(String d)
	{
		System.out.println(d);
	}
 void internPhone(String p)
	{
		System.out.println(p);
	}
 void internEmail(String e) {
		System.out.println(e);

	}
	 void internAddress(String ad) {
		System.out.println(ad);
	}
	 void internEducation(String ed)
	 {
		 System.out.println(ed);
	 }
	 void internGender(String ge)
	 {
		 System.out.println(ge);
	 }

	public static void main(String[] args) 
	{
		InternDetails name= new InternDetails();
		name.internName("Jawahar");
		name.internDOB("March 23, 1998");
		name.internEducation("MCA");
		name.internPhone("7904970160");
		name.internEmail("jawaharsumathi23@gmail.com");
		name.internGender("Male");
		name.internAddress("Salem");	
	}

}
