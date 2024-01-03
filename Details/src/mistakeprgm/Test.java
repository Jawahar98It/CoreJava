package mistakeprgm;

public class Test {
	
	private void m1(){
		m2();
		System.out.printf("1");
		}
		private void m2(){
		m3();
		System.out.print("2");
		}
		private void m3(){
		System.out.printf("3");
		try{
		int sum = 4/0;
		System.out.printf("4");
		}
		catch(ArithmeticException e){
		System.out.printf("5");
		}
		System.out.printf("7");
		}

	public static void main(String[] args) 
	{
		System.out.println("Challenge 1");
		try
		{
			System.out.printf("1");
			int sum = 9 / 0;
			System.out.printf("2");
		}
			catch(ArithmeticException e)
		{
			System.out.printf("3");
		}
			catch(Exception e){
			System.out.printf("4");
			}
			finally{
			System.out.printf("5");
			}
		
		System.out.println("\n"+"Challenge 2");
		Test obj = new Test();
		obj.m1();
		
		System.out.println("\n"+"Challenge 3");
		try{
			System.out.printf("1");
			int data = 5 / 0;
			}
			catch(ArithmeticException e){
			System.out.printf("2");
			System.exit(0);
			}
			finally{
			System.out.printf("3");
			}
			System.out.printf("4");
			
			
		
		
	}

	}

