package org.bik;

public class Ninja extends BMW {
	
	public void mileage(String mileage) {
		System.out.println("Vehicle Mileage: "+mileage);

	}
	public void enginePower(String engpower) {
		System.out.println("Vehicle Mileage: "+engpower);

	}

	private void price(double price) {
		System.out.println("Price: "+price);

	}
	private void model(String name) {
		System.out.println("Model Name: "+name);

	}
	private void speed(float speed) {
		System.out.println("Speed of Vehicle: "+speed);

	}
	
	public static void main(String[] args) {
		Ninja vehicle = new Ninja();
		vehicle.mileage("40 KMPH");
		vehicle.enginePower("1230 HP");
		vehicle.price(1575000);
		vehicle.model("ETIOS");
		vehicle.speed(80.6f);
		

	}

}
