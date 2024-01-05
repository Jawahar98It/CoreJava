package Challenge_9;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Inmakes_challenge32 {

	public static void main(String[] args) {
		
		System.out.println("Challenge 32 & Challenge 37");
		Map<Integer, Integer> mp1=new LinkedHashMap();
		mp1.put(10, 10);
		mp1.put(20,20);
		mp1.put(30, 30);
		mp1.put(40, 40);
		mp1.put(50, 50);
		mp1.put(60, 60);
		mp1.put(10, 10);
		mp1.put(50, 50);
		mp1.put(40, 40);
		Iterator<Entry<Integer, Integer>> itr1=mp1.entrySet().iterator();
		while(itr1.hasNext())
		{
			Map.Entry<Integer, Integer> entry1=itr1.next();
			System.out.println("Keys: "+entry1.getKey()+"Values: "+entry1.getValue());
		}
		
		System.out.println("Challenge 37 in for loop");
		//using forloop
		Set<Entry<Integer, Integer>> entry = mp1.entrySet();
		
		for (Entry<Integer, Integer> entry2 : entry) {
			
			Integer entryKey =entry2.getKey();
			System.out.println("Keys:"+entryKey);
			Integer entryValue=entry2.getValue();
			System.out.println("Values: "+entryValue);
			
		}

	}

}
