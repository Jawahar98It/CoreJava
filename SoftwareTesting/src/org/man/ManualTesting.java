package org.man;
import org.aut.*;

public class ManualTesting extends Automationtesting {
	
	private void regressionTesting() {
		System.out.println("Testing the developer fixed bugs once they completed");

	}
	private void reTesting() {
		System.out.println("Test the Project from the strach after completing every testing");

	}

	public static void main(String[] args) {
		ManualTesting mnltest=new ManualTesting();
		mnltest.regressionTesting();
		mnltest.reTesting();
		mnltest.softwareName();
		mnltest.testngFramework();
		mnltest.cucumberFramework();

	}

}
