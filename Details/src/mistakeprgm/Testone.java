package mistakeprgm;

public class Testone {

	public static void main(String[] args) {
		System.out.println("\n"+"Challenge 4");
		try{
			System.out.printf("1");
			int data = 5 / 0;
			}
			catch(ArithmeticException e){
			Throwable obj1 = new Throwable("Sample");
			try{
			throw obj1;
			}
			catch (Throwable e1) {
			System.out.printf("8");
			}
			}
			finally{
			System.out.printf("3");
			}
			System.out.printf("4");

	}

}
