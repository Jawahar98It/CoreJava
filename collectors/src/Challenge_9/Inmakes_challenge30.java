package Challenge_9;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Inmakes_challenge30 {

	public static void main(String[] args) {
		Map<String, String> mp3=new Hashtable();
		mp3.put("Sam", "Selenium");
		mp3.put("Karthik", "framework");
		mp3.put("Gowtham", "oracle");
		mp3.put("Gokul", "corejava");
		mp3.put("Neethu", "jira");
		
		System.out.println("Challenge 30");
		Set<String>Keys4=mp3.keySet();
		System.out.println("Keys data from hashtable: "+Keys4);
	}

}
