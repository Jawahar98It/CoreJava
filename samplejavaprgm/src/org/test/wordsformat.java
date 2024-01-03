package org.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class wordsformat {
	public static boolean isValid(String phn_number)
	{
	Pattern p =Pattern.compile("//d{10}");
	Matcher m=p.matcher(phn_number);
	return(m.matches());
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//Challenge 1
		System.out.println("Challenge 1");
		String Str1="InmakesInfotech";
		String Str2="SeleniumAutomationtool";
		String Str3="PenealSamuel";
		String Str4="j a v a p r o g r a m";
		String Str5="968815564";
		
		System.out.println("Length of String 1 => "+Str1+" = "+Str1.length());
		System.out.println("Length of String 2 => "+Str2+" = "+Str2.length());
		System.out.println("Length of String 3 => "+Str3+" = "+Str3.length());
		System.out.println("Length of String 4 => "+Str4+" = "+Str4.length());
		System.out.println("Length of String 5 => "+Str5+" = "+Str5.length());
		
		//Challenge 2
		System.out.println("\n"+"Challenge 2");
		System.out.println("Index value of 'o' in String 1 => "+Str1+"="+Str1.lastIndexOf('o'));
		System.out.println("Index value of 'o' in String 2 => "+Str2+"="+Str2.lastIndexOf('o'));
		System.out.println("Index value of 'n' in String 3 => "+Str3+"="+Str3.lastIndexOf('n'));
		System.out.println("Index value of ' ' in String 4 => "+Str4+"="+Str4.lastIndexOf(' '));
		System.out.println("Index value of '1' in String 5 => "+Str5+"="+Str5.indexOf('1'));
		
		//Challenge 3
		System.out.println("Challenge 3");
		char value='h';
		int index = Str1.indexOf(value);
		if (index != -1)
		{
			 System.out.println("The character at index " + index +" from "+ Str1 + " is: " + Str1.charAt(index));
		}
		char value1='m';
	
		for(int i=0;i<Str2.length();i++)
		{
			if(Str2.charAt(i)==value1)
			{
				System.out.println("Character "+ value1 +" from " + Str2 +" found at index " + i);
			}
		}
		char value2='u';
		int index1=Str3.indexOf(value2);
		
		if(index1 != -1)
		{
			System.out.println("The character at index " + index1 +" from "+ Str3 + " is: " + Str3.charAt(index1));
		}
		
		char value3='p';
		int index2=Str4.indexOf(value3);
		if(index2 != -1)
		{
			System.out.println("The character at index " + index2 +" from "+ Str4 + " is: " + Str4.charAt(index2));
		}
		
		char value4='6';
		for(int j=0;j<Str5.length();j++)
		{
			if(Str5.charAt(j)==value4)
			{
				System.out.println("Character "+ value4 +" from " + Str5 +" found at index " + j);
			}
		}
		
		System.out.println("Challenge 4");
		String email="samuel@inmakes.co.in";
		int email_index=6;
		
		if(email_index >= 0 && email_index < email.length() && email.charAt(email_index)=='@')
			{
				System.out.println(email+" is valid");
			}
			else
			{
				System.out.println(email+" is invalid");
			}
		System.out.println("Challenge 5");
		String address="Inmakes Infotech, Vijay Tower, Kochi";
		String pin="pincode";
		if(pin==address)
		{
			System.out.println("Address is valid");
		}
		else
		{
			System.out.println("Address is invalid");
		}
		System.out.println("Challenge 6");
		System.out.println("Enter Phn number");
		String phn_number=sc.nextLine();
		
		
		if(isValid(phn_number))
		{	
			System.out.println("Valid Address");
		}
		else
		{
			System.out.println("Invalid Address");
		}
		
		
		System.out.println("Challenge 7");
		String phn_num ="89034256972365";
		String phn_num2="9095484678";
		if(phn_num.length()==10)
		{
			System.out.println("number is valid: "+phn_num);
		}
		else
		{
			System.out.println("Number is invalid: "+phn_num);
		}
		
		if(phn_num2.length()==10)
		{
			System.out.println("number is valid: "+phn_num2);
		}
		else
		{
			System.out.println("number is valid: "+phn_num2);
		}
		
		System.out.println("Challenge 8");
		String course="Welcome to class java";
		course=course.replace("java" ,"sql");
		System.out.println("Replaced string: "+course);
		
		System.out.println("Challenge 9");
		String inst_address="Inmakes Kochi";
		inst_address=inst_address.replace("Kochi", "Chennai");
		System.out.println("Replaced Sentence: "+inst_address);
		
		System.out.println("Challenge 10");
		String classes="Welcome to java class";
		String class_origin=classes.replaceAll(" ", "#");
		System.out.println(class_origin);
		
		System.out.println("Challenge 11");
		String cap_word="INMAKES INFOTECH";
		System.out.println("Lowercase of given string: "+cap_word.toLowerCase());
		
		System.out.println("Challenge 12");
		if(classes.isEmpty()==true)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		
		System.out.println("Challenge 13");
		
		System.out.println("Enter First name");
		String name=sc.nextLine();
		System.out.println("Enter Second name");
		String name2=sc.nextLine();
		if(name.compareTo(name2)==0)
		{
			System.out.println("Both Strings are equal");
		}
		else
		{
			System.out.println("Both strings are not equal");
		}
		
		System.out.println("Challenge 14");
		String name3="Nisha";
		String name4="nisha";
		System.out.println("name3: "+name3+"\t" +System.identityHashCode(name3));
		System.out.println("name4: "+name4 +"\t"+System.identityHashCode(name4));
		
		System.out.println("Challenge 15");
		System.out.println(classes);
		String[] after_split=classes.split("\\s");
		for (String aft_split:after_split)
		{
			System.out.println(aft_split);
		}
		
		System.out.println("Challenge 16");
		System.out.println(classes);
		System.out.println(classes.substring(0, 7));
	}

}
