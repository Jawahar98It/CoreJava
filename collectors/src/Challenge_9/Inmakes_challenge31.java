package Challenge_9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Inmakes_challenge31 {

	public static void main(String[] args) {
		System.out.println("Challenge 31"+"&"+"Challenge 36");
		Map<Integer, String> mp=new HashMap();
		mp.put(10, "java");
		mp.put(20, "sql");
		mp.put(30, "oops");
		mp.put(40, "Sql");
		mp.put(50, "oracle");
		mp.put(60, "DB");
		mp.put(10, "selenium");
		mp.put(50, "psql");
		mp.put(40, "Hadoop");

		Set<Entry<Integer, String>>ent=mp.entrySet();
		//System.out.println(ent);
		
		for (Entry<Integer, String> entry : ent) 
		{
			Integer entryKey =entry.getKey();
			System.out.println("Keys:"+entryKey);
			String entryValue=entry.getValue();
			System.out.println("Values: "+entryValue);
		}

	}

}
