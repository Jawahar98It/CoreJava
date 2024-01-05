package Challenge_9;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Inmakes_challenge2 
{
	public static void main(String[] args) {
		System.out.println("Challenge 14");
		Set<Integer> S1=new LinkedHashSet();
		S1.add(10);
		S1.add(20);
		S1.add(30);
		S1.add(90);
		S1.add(10);
		S1.add(10);
		S1.add(40);
		S1.add(50);
		
		Set<Integer> Si1 = new LinkedHashSet();
		Si1.add(10);
		Si1.add(20);
		Si1.add(60);
		Si1.add(50);
		Si1.add(40);
		Si1.add(70);
		Si1.add(80);
		Si1.add(90);
		
		
		S1.retainAll(Si1);
		System.out.println("Common Values: "+S1);
		
		System.out.println("----------------------------------");
		System.out.println("Challenge 15");
		Set<Integer> S2 = new TreeSet();
		S2.add(10);
		S2.add(20);
		S2.add(30);
		S2.add(40);
		S2.add(50);
		S2.add(60);
		S2.add(70);
		S2.add(80);
		
		Set<Integer> Si2= new TreeSet();
		Si2.add(100);
		Si2.add(200);
		Si2.add(300);
		Si2.add(400);
		Si2.add(500);
		Si2.add(600);
		Si2.add(700);
		Si2.add(800);
		
		S2.retainAll(Si2);
		System.out.println("Common Values: "+S2);
		
		
		System.out.println("Challenge 16");
		Set<Integer> S3 = new HashSet();
		S3.add(10);
		S3.add(20);
		S3.add(30);
		S3.add(90);
		S3.add(10);
		S3.add(10);
		S3.add(40);
		S3.add(50);
		
		Set<Integer> Si3 = new HashSet();
		Si3.add(30);
		Si3.add(40);
		Si3.add(50);
		Si3.add(60);
		Si3.add(80);
		
		S3.removeAll(Si3);
		
		System.out.println("After Removed values: "+S3);
		
		System.out.println("Challenge 17");
		Set<Integer> S4 = new LinkedHashSet();
		
		S4.add(10);
		S4.add(20);
		S4.add(30);
		S4.add(90);
		S4.add(10);
		S4.add(10);
		S4.add(40);
		S4.add(50);
		
		Set<Integer> Si4 = new LinkedHashSet();
		Si4.add(10);
		Si4.add(20);
		Si4.add(60);
		Si4.add(50);
		Si4.add(40);
		Si4.add(70);
		Si4.add(80);
		Si4.add(90);
		
		S4.removeAll(Si4);
		System.out.println("After Remove Linked Hash Set values: "+S4);
		
		System.out.println("Challenge 18");
		Set<Integer> S5 = new TreeSet();
		
		S5.add(10);
		S5.add(20);
		S5.add(30);
		S5.add(40);
		S5.add(50);
		S5.add(60);
		S5.add(70);
		S5.add(80);
		
		Set<Integer> Si5 = new TreeSet();
		Si5.add(100);
		Si5.add(200);
		Si5.add(300);
		Si5.add(400);
		Si5.add(500);
		Si5.add(600);
		Si5.add(700);
		Si5.add(800);
		
		S5.removeAll(Si5);
		System.out.println("After Remove TreeSet values: "+S5);
		
		System.out.println("Challenge 19");
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
		
		System.out.println("Hashmap values: "+mp);
		
		
		System.out.println("Challenge 20");
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
		
		System.out.println("Linked Hashmap values: "+mp1);
		
		
		System.out.println("Challenge 21");
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
		
		System.out.println("Treemap values: "+mp2);
		
		System.out.println("Challenge 22");
		Map<String, String> mp3=new Hashtable();
		mp3.put("Sam", "Selenium");
		mp3.put("Karthik", "framework");
		mp3.put("Gowtham", "oracle");
		mp3.put("Gokul", "corejava");
		mp3.put("Neethu", "jira");
		
		System.out.println("Hashtable values: "+mp3);
		
		//Challenge 23 data is linked with challenge 19
		System.out.println("Challenge 23");
		
		Set<Integer>Keys=mp.keySet();
		System.out.println("Keys data from the Hashmap: "+Keys);
		
		//Challenge 24 data is linked with Challenge 20
		System.out.println("Challenge 24");
		Set<Integer> Keys1=mp1.keySet();
		System.out.println("Keys data from the linkedhashmap: "+Keys1);
		
		//Challenge 25 data is linked with Challenge 21
		System.out.println("Challenge 25");
		Set<String>Keys2=mp2.keySet();
		System.out.println("Keys data from the Treemap: "+Keys2);
		
		//Challenge 26 data is linked with Challenge 22
		System.out.println("Challenge 26");
		Set<String>Keys3=mp3.keySet();
		System.out.println("Keys data from the Hashtable: "+Keys3);
		
		//Challenge 27 is linked with Challenge 19
		System.out.println("Challenge 27");
		Collection<String>values=mp.values();	
		System.out.println("Values from the HashMap: "+values);
		
		//Challenge 28 is linked with Challenge 20
		System.out.println("Challenge 28");
		Collection<Integer>values1=mp1.values();	
		System.out.println("Values from the LinkedHash map: "+values1);
		
		//Challenge 29 is linked with Challenge 21
		System.out.println("Challenge 29");
		Collection<Integer> values2=mp2.values();
		System.out.println("Values from the Treemap: "+values2);
		
		System.out.println("Challenge 40");
		Map<String, String> MP= new HashMap();
		MP.put("empId", "Emp001");
		MP.put("name", "Jaimie");
		MP.put("phone", "9638527410");
		MP.put("address", "Paris");
		MP.put("dob", "Jun-02, 1996");
		MP.put("doj", "Oct-05, 2021");
		MP.put("email", "jaimie@gmail.com");
		MP.put("gender", "Male");
		MP.put("Sql", "1.5yr experience");
		
		System.out.println(MP);
		for (Map.Entry<String, String> dataentry : MP.entrySet()) 
		{
			String key = dataentry.getKey();
			String val = dataentry.getValue();
			
			System.out.println("Key:"+key+"\t"+"Value:"+val);
		}
		
		System.out.println("Challenge 41");
		Map<String, String> MP1= new TreeMap();
		MP1.put("stdId", "Stu001");
		MP1.put("stdName", "Jaimie");
		MP1.put("stdPhone", "9638527410");
		MP1.put("address", "Paris");
		MP1.put("dob", "Jun-02, 1996");
		MP1.put("email", "jaimie@gmail.com");
		MP1.put("gender", "Male");
		
		System.out.println(MP1);
		for (Map.Entry<String, String> dataentry : MP1.entrySet()) 
		{
			String key1 = dataentry.getKey();
			String val1 = dataentry.getValue();
			
			System.out.println("Key:"+key1+"\t"+"Value:"+val1);
		}
		
		
	}
}
