package org.inm;

class internDetail
{
	String institute;
	String coursename;
	String courseduration;
	public void internName(String ins) {
		System.out.println("Institute Name is:"+ins);

	}
	public void registeredInternship(String cname) {
		System.out.println("Registered Internship Course is: "+cname);

	}
	public void internshipDuration(String cdur) {
		System.out.println("Duration of Course is: "+cdur);

	}
}
public class InternEducation extends internDetail 
{
	String course;
	float percentage;
	public void ugDegree(String deg) {
		System.out.println("Candidate UG Degree: "+deg);

	}
	public void ugPercentage(double percent) {
		System.out.println("Candidate UG Percentage: "+percent);

	}
	public static void main(String[] args) {
		InternEducation ide=new InternEducation();
		ide.internName("Inmakes Internship");
		ide.registeredInternship("Software Testing");
		ide.internshipDuration("3 Months");
		ide.ugDegree("B.C.A");
		ide.ugPercentage(64.00);
		
		

	}

}
