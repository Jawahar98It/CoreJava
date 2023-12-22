package org.add;

public class Branches {
	public void inmakesTrivendrum() 
	{
		System.out.println("Welcome to Inmakes Trivendrum Branch");
	}
	public void inmakesHyderabad() {
		System.out.println("Welcome to Inmakes Hyderabad Branch");
		
	}
	public void inmakesDubai() {
		System.out.println("Welcome to Inmakes Dubai Branch");
		
	}
	public void inmakesChennai() {
		System.out.println("Welcome to Inmakes Chennai Branch");
		
	}
	public void inmakesKochi() {
		System.out.println("Welcome to Inmakes Kochi Branch");
		
	}

	public static void main(String[] args) 
	{
		Branches branch = new Branches();
		branch.inmakesTrivendrum();
		branch.inmakesKochi();
		branch.inmakesChennai();
		branch.inmakesHyderabad();
		branch.inmakesDubai();
	}
}
