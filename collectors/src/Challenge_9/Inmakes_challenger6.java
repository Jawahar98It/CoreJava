package Challenge_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inmakes_challenger6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------");
		System.out.println("Challenge 10");
		List<Integer> L6 = new ArrayList();
		System.out.println("Number of elements Stored in list");
		int list_value6=sc.nextInt();
		
		for(int k=0;k<list_value6;k++)
		{
			int list_data=sc.nextInt();
			L6.add(list_data);
		}
		
		for(int number:L6)
		{
			System.out.println(number);
		}
	}

}
