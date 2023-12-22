package org.sof;

public class Multimedia extends DigitalMarketing {
	 void adobePhotoshop() 
	 {
		 System.out.println("Adobe Photoshop is used for animation design");
	}
	 void indesign() {
		System.out.println("Design is used to view the website attractive");

	}

	public static void main(String[] args) {
		Multimedia media = new Multimedia();
		System.out.println("1. Multimedia");
		media.adobePhotoshop();
		media.indesign();
		System.out.println("\n"+"2. Digital Marketing");
		media.contentMarketing();
		media.searchEngine();
		System.out.println("\n"+"3. FullStacks");
		media.coreJava();
		media.advanceJava();
		System.out.println("\n"+"4. Software Testing");
		media.manualTesting();
		media.automationTesting();

	}

}
