package Challenge_9;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Inmakes_challenger2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------");
		System.out.println("Challenge 6");
		Set<Integer> S3=new TreeSet();
		System.out.println("Number of Elements Stored in TreeSet");
		int set_3 = sc.nextInt();
		System.out.println("Data in Treeset, (Try to stop with Non-Integer)");
		while(sc.hasNextInt())
		{
			int set_value3=sc.nextInt();
			S3.add(set_value3);
		}
		System.out.println("Data in TreeSet: "+S3);

	}

}
