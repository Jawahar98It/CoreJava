package ORG.SOF;

public class ApiTesting implements Manual,Automation 
{
	
	public void RestAssured() {
		System.out.println("ApiTesting Framework: RestAssured");
	}

	public static void main(String[] args) {
		ApiTesting apitest= new ApiTesting();
		apitest.Framework();
		apitest.TestCase();
		apitest.RestAssured();

	}

	@Override
	public void Framework() {
		System.out.println("Testing Framework : TestNG");
		
	}

	@Override
	public void TestCase() {
		System.out.println("Test Design for the Project");
		
	}

}
