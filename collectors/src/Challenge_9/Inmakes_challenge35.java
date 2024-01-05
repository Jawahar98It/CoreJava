package Challenge_9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Inmakes_challenge35 {
	public static void main(String[] args) {
		
		System.out.println("Challenge 35");
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
		Iterator<Entry<Integer, String>> itr4 = mp.entrySet().iterator();
		while(itr4.hasNext())
		{
			Map.Entry<Integer, String> entry4 = itr4.next();
			System.out.println("Keys:"+entry4.getKey()+"\t"+"Values:"+entry4.getValue());
		}
	}

}
