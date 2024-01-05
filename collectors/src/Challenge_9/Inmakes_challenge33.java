package Challenge_9;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Inmakes_challenge33 {

	public static void main(String[] args) {
		System.out.println("Challenge 33 & Challenge 38");
		Map<String, Integer> mp2=new TreeMap();
		mp2.put("!", 10);
		mp2.put("@", 20);
		mp2.put("#", 30);
		mp2.put("$", 40);
		mp2.put("%", 50);
		mp2.put("^", 60);
		mp2.put("&", 10);
		mp2.put("*", 50);
		mp2.put("(", 40);
		Iterator<Entry<String, Integer>> itr2 = mp2.entrySet().iterator();
		while(itr2.hasNext())
		{
			Map.Entry<String, Integer> entry2 = itr2.next();
			System.out.println("Keys: "+entry2.getKey()+"Values: "+entry2.getValue());
		}
		

	}

}
