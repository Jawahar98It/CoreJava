package Challenge_9;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Inmakes_challenge34 {

	public static void main(String[] args) {
		System.out.println("Challenge 34 & Challenge 39");
		Map<String, String> mp3=new Hashtable();
		mp3.put("Sam", "Selenium");
		mp3.put("Karthik", "framework");
		mp3.put("Gowtham", "oracle");
		mp3.put("Gokul", "corejava");
		mp3.put("Neethu", "jira");
		
		Iterator<Entry<String, String>> itr3 = mp3.entrySet().iterator();
		while(itr3.hasNext())
		{
			Map.Entry<String, String> entry3 = itr3.next();
			System.out.println("Keys:"+entry3.getKey()+"\t"+"Values:"+entry3.getValue());
		}

	}

}
