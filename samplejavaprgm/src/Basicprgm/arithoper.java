package Basicprgm;

import java.util.Scanner;

public class arithoper {

	public static void main(String[] args) {
		int num;int i,j;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to print:");
		num=sc.nextInt();
		for(i=0;i<num;i++)
		{
			for(j=0;j<i+1;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println(" ");
		}
	}

}
