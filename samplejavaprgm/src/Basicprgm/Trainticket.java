package Basicprgm;

import java.util.Scanner;

public class Trainticket {

	public static void main(String[] args) {
		String fromStation, toStation;
		double ticketPrice, foodPrice, travelCost, hotelRent;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Second Challenge"+"\n"+"Ticket Details");
		
	
		
		System.out.println("Departure Place:");
		fromStation=sc.nextLine();
		System.out.println("Arrival Place:");
		toStation=sc.nextLine();
		System.out.println("TicketFare:");
		ticketPrice=sc.nextDouble();
		System.out.println("Food Price:");
		foodPrice=sc.nextDouble();
		System.out.println("Travel cost:");
		travelCost=sc.nextDouble();
		System.out.println("Hotel Rent:");
		hotelRent=sc.nextDouble();
		
		System.out.println("From Station: "+fromStation);
		System.out.println("To Station: "+toStation);
		System.out.println("Ticket Price: "+ticketPrice);
		System.out.println("Food Price: "+foodPrice);
		System.out.println("Travel Cost: "+travelCost);
		System.out.println("Hotel Rent: "+hotelRent);

	}

}
