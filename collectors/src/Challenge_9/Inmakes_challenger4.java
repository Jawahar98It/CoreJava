package Challenge_9;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Inmakes_challenger4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------");
		System.out.println("Challenge 8");
		List<Integer> L4 = new LinkedList();
		System.out.println("Number of elements Stored in list");
		int list_value4=sc.nextInt();
		System.out.println("Data in LinkedList,(Try to stop with Non-Integer)");
		while(sc.hasNextInt())
		{
			int n1=sc.nextInt();
			L4.add(n1);
		}
		System.out.println("Linkedlist values: "+L4);
		System.out.println("Convert List into Set");
		Set<Integer> S5= new TreeSet();
		S5.addAll(L4);
		System.out.println("Treeset values: "+S5);

	}

}
