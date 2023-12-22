package org.inm;

public class SoftwareTesting {
	String name;
	String auto;
	String man;
	String frame;
	private void coreJava(String s) 
	{
		System.out.println("Learn"+"\t"+s);

	}
	private void selenium(String a) 
	{
		System.out.println("Learn"+"\t"+a+"\t"+"Automation");
	}
	private void frameworks(String f) 
	{
		System.out.println("Learn"+"\t"+f);
	}
	private void manual(String m) 
	{
		System.out.println("Learn"+"\t"+m+"\t"+"Testing");

	}

	public static void main(String[] args) {
		System.out.println("1. SoftwareTesting");
		SoftwareTesting softtest= new SoftwareTesting();
		org.inm.FullstacksJava fullstack = new org.inm.FullstacksJava();
		org.inm.DigitalMarketing digimar= new org.inm.DigitalMarketing();
		org.inm.Multimedia multimed= new org.inm.Multimedia();
		
		
		softtest.coreJava("CoreJava");
		softtest.selenium("Selenium");
		softtest.frameworks("Frameworks");
		softtest.manual("Manual");
		
		System.out.println("\n"+"2. FullStack Developer");
		
		fullstack.coreJava("Core Java");
		fullstack.advanceJava("Advance Java");
		fullstack.javaScript("Javascript");
		fullstack.springFramework("Spring Framework");
		
		System.out.println("\n"+"3. Digital Marketing");
		digimar.blogging("Blogging");
		digimar.searchEngine("Search Engine");
		digimar.contentMarketing("Content Marketing");
		digimar.socialMedia("Social Media");
		
		System.out.println("\n"+"4. Multimedia");
		multimed.illustrator("Illustrator");
		multimed.adobePhotoshop("Adobe Photoshop");
		multimed.indesign("Design");
		multimed.adobeAfterefects("Adobe AfterEffects");

	}

}
