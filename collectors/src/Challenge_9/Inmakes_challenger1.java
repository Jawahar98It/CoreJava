package Challenge_9;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Inmakes_challenger1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------------");
		System.out.println("Challenge 5");
		Set<Integer> S2= new LinkedHashSet();
		System.out.println("Number of Elements in LinkedHashset");
		int set_2=sc.nextInt();
		for(int j=0;j<set_2;j++)
		{
			int set_value2=sc.nextInt();
			S2.add(set_value2);
		}
		System.out.println("LinkedHashset values: "+S2);
	}

}
