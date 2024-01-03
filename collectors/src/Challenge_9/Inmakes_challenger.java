package Challenge_9;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Inmakes_challenger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Challenge 4");
		Set<Integer> S1=new HashSet();
		System.out.println("Number of Elements Stored in Hashset");
		int set_1=sc.nextInt();
		System.out.println("Data in Hashset"+"(Try to Stop with Non-Integer)");
		while(sc.hasNextInt())
		{
			int set_value=sc.nextInt();
			S1.add(set_value);
		}
		System.out.println("Data in Hashset: "+S1);

		
		
	}

}
