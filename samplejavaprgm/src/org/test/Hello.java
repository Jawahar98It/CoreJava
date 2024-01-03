
package org.test;

public class Hello {

	public static void main(String[] args) {
		//Challenge 1
		System.out.println("Challenge 1");
		for (int i=1;i<=100;i++)
		{
			System.out.println(i);
		}
		
		//Challenge 2
		System.out.println("Challenge 2");
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
			break;
			}
			System.out.println(i);
		}
		
		//Challenge 3
		System.out.println("Challenge 3");
		for (int i = 1; i <= 10; i++) 
		{
		if (i == 5) 
		{
		continue;
		}
		System.out.println(i);
		}
		
		System.out.println("Challenge 4");
		for (int i = 1; i <= 3; i++) 
		{
			for (int j = 1; j <= 3; j++) 
			{
				System.out.println(j);
			}
		}
		System.out.println("Challenge 5");
		for (int i = 1; i <= 3; i++) 
		{
			for (int j = 1; j <= 3; j++) 
			{
				System.out.println(i);
			}
		}
		System.out.println("Challenge 6");
		
		for (int i = 1; i <= 3; i++) 
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.println(j);
			}
		}
		System.out.println("Challenge 7");
		
		for (int i = 1; i <= 3; i++)
		{
			for (int j = i + 1; j <= 3; j++)
			{
				System.out.println(j);
			}
		}
		System.out.println("Challenge 8");
		
		for (int i = 1; i <= 3; i++)
		{
			for (int j = i + 1; j <= i; j++)
			{
				System.out.println(j);
			}
		}
		System.out.println("Challenge 9");
		for (int i = 1; i <= 10; i++)
		{
			if (i == 5)
			{
				break;
			}
			System.out.println(i);
		}
		//Challenge 10
		System.out.println("Challenge 10");
				for(int i=1;i<=10;i++)
				{
					if(i==5)
					{
						continue;
					}
					System.out.println(i);
				}
	}

}
