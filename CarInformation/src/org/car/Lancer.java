package org.car;

import java.util.Scanner;

public class Lancer extends Skoda {
	
	public void price(double price)
	{
		System.out.println("Vehicle Price: "+price);
	}
	public void model(String version)
	{
		System.out.println("Vehicle Model version: "+version);
	}
	private void seater(String seat) {
		System.out.println("Seater of Car: "+seat);

	}
	private void window(String window) {
		System.out.println("Windowsn of Car: "+window);

	}
	private void mileage(double mileage) {
		System.out.println("Mileage of Car: "+mileage);

	}
	private void enginePower(int power) {
		System.out.println("Engine Power of Car: "+power);

	}
	public static void main(String[] args) 
	{
		Lancer car = new Lancer();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vehicle Details");
		System.out.println("Car Model Name:");
		String modelname=sc.nextLine();
		System.out.println("Seating Capacity");
		String seat=sc.nextLine();
		System.out.println("Windows view");
		String window=sc.nextLine();
		System.out.println("Mileage of Car:");
		double milege=sc.nextDouble();
		System.out.println("Engine Power of Car:");
		int engine=sc.nextInt();
		System.out.println("Car Price:");
		double price=sc.nextDouble();
		
		car.price(price);
		car.model(modelname);
		car.seater(seat);
		car.window(window);
		car.enginePower(engine);
		car.mileage(milege);
		
	}

}
