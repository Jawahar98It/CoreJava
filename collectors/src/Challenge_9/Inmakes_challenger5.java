package Challenge_9;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Inmakes_challenger5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------------");
		System.out.println("Challenge 9");
		List<Integer> L5 = new LinkedList();
		System.out.println("Number of elements Stored in list");
		int list_value5=sc.nextInt();
		System.out.println("Data in LinkedList,(Try to stop with Non-Integer)");
		while(sc.hasNextInt())
		{
			int n2=sc.nextInt();
			L5.add(n2);
		}
		System.out.println("Linkedlist values: "+L5);
		System.out.println("Convert List into Set");
		Set<Integer> S6= new LinkedHashSet();
		S6.addAll(L5);
		System.out.println("Treeset values: "+S6);

	}

}
