package Challenge_9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Inmakes_Challenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Challenge 1");
		List<Integer> l1 = new ArrayList();
		System.out.println("Number of elements stored in arraylist");
		int n = sc.nextInt();
		System.out.println("Data in arraylist");
		for(int i=0;i<n;i++)
		{
			int value=sc.nextInt();
			l1.add(value);
		}
		System.out.println("Data in Arraylist: "+l1);
		int size = l1.size();
		System.out.println("Size of the L1 Arraylist: "+size);
		
		System.out.println("----------------------------------------");
		System.out.println("Challenge 2");
		List<Integer> l2 = new LinkedList();
		System.out.println("Number of Elements Stored in Linkedlist");
		int N=sc.nextInt();
		System.out.println("Data in LinkedList"+"(Try to Stop with Non-Integer)");
		while(sc.hasNextInt())
		{
			int Value=sc.nextInt();
			l2.add(Value);
		}
		System.out.println("Data in Linkedlist: "+l2);
		int link_size=l2.size();
		System.out.println("Size of Linkedlist: "+link_size);
		
		System.out.println("----------------------------------------------");
		System.out.println("Challenge 3");
		Set<Integer> l3 = new LinkedHashSet();
		l3.add(10);
		l3.add(10);
		l3.add(20);
		l3.add(50);
		l3.add(60);
		l3.add(80);
		l3.add(60);
		l3.add(50);
		
		Iterator<Integer> itr = l3.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	    System.out.println("------------------------------------");
		System.out.println("Challenge 11");
		
		int[] values= {10,20,30,40,50,60,70,80,90,10,20};
		Set<Integer> s4=new TreeSet();
		
		for (int data:values)
		{
			s4.add(data);
		}
		
		Iterator<Integer> itr3= s4.iterator();
		while(itr3.hasNext())
		{
			int xy=itr3.next();
			System.out.println(xy);
		}
		
		
		System.out.println("------------------------------------");
		System.out.println("Challenge 12");
		
		int[] values1= {10,20,30,40,50,60,70,80,90,10,20};
		Set<Integer> s5=new HashSet();
		
		for (int data1:values1)
		{
			s5.add(data1);
		}
		
		Iterator<Integer> itr4= s5.iterator();
		while(itr4.hasNext())
		{
			int xy1=itr4.next();
			System.out.println(xy1);
		}
		
		System.out.println("-----------------------------");
		System.out.println("Challenge 13");
		Set<Integer> s6=new HashSet();
		s6.add(10);
		s6.add(20);
		s6.add(30);
		s6.add(90);
		s6.add(10);
		s6.add(10);
		s6.add(40);
		s6.add(50);
		
		Set<Integer> Si6 = new HashSet();
		Si6.add(30);
		Si6.add(40);
		Si6.add(50);
		Si6.add(60);
		Si6.add(80);
		
		s6.retainAll(Si6);
		System.out.println("Common Values: "+s6);
	}

}
