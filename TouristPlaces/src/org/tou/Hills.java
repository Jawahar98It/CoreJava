package org.tou;

class Beaches
{
	void marinaBeach() 
	{
		System.out.println("Marina Beach is the Second Largest Beach");
	}
	 void mahabalipuramBeach() 
	{
		System.out.println("Pallavas Articrafts are in Mahabalipuram Beach");
	}
}
class ThemePark extends Beaches
{
	 void wonderla() 
	{
		System.out.println("Wonderla is located in kerela and Karnataka");
	}
	 void blackThunder()
	{
		System.out.println("Black Thunder is located in TamilNadu");
	}
	
}
public class Hills extends ThemePark {
	
	 void munnar() {
		System.out.println("Munnar is located in Idukki District of Kerela State");

	}
	 void wagamon() {
		System.out.println("Wagamon is located in Kerela State");
	}

	public static void main(String[] args) {
		Hills hill = new Hills();
		hill.marinaBeach();
		hill.mahabalipuramBeach();
		hill.wonderla();
		hill.blackThunder();
		hill.munnar();
		hill.wagamon();
		

	
		
		

	}

}
