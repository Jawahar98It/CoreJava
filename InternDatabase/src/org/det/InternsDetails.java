package org.det;

public class InternsDetails {
    void interns(String Name, String Designation) {
		System.out.println("Candidate Name: "+Name +"\n"+"Candidate Designation: "+Designation);

	}
	void interns(float Experience)
	{
		System.out.println("Candidate Experience: "+Experience);
	}
	void interns(String Address, Long Phone)
	{
		System.out.println("Candidate Location: "+Address+"\n"+"Candidate Phone: "+Phone);
	}

	public static void main(String[] args) {
		InternsDetails indetail = new InternsDetails();
		indetail.interns("James","Software Tester");
		indetail.interns(1.5f);
		indetail.interns("Bengaluru",9876543211l);

	}

}
