package mistakeprgm;

import java.io.EOFException;
import java.io.IOException;

public class Testtwo {

	public static void main(String[] args) {
		System.out.println("Challenge 5"+"\n");
		try{
			System.out.printf("1");
			int value = 10 / 0;
			throw new IOException();
			}
			catch(EOFException e){
			System.out.printf("2");
			}
			catch(ArithmeticException e){
			System.out.printf("3");
			}
			catch(NullPointerException e){
			System.out.printf("4");
			}
			catch(IOException e){
			System.out.printf("5");
			}
			catch(Exception e){
			System.out.printf("6");
			}

	}

}
