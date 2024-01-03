package Challenge_9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Inmakes_challenger3 {

	public static void main(String[] args) {
		System.out.println("-------------------------------------");
		System.out.println("Challenge 7");
		List<Integer> L3=new ArrayList();
		L3.add(10);
		L3.add(20);
		L3.add(30);
		L3.add(90);
		L3.add(10);
		L3.add(10);
		L3.add(40);
		L3.add(50);
		Set<Integer> S4 = new HashSet();
		S4.addAll(L3);
		
		System.out.println("Original List:"+L3);
		System.out.println("Set values:"+S4);

	}

}
