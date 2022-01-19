package myfirstprogram;

import java.util.Scanner;

public class primenumber {
	public static void main(String[] args)
	{
		int temp;
		boolean isprime=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		 int num=sc.nextInt();
		for(int i=2;i<=num/2;i++)
		{
			temp=num%i;
			if(temp==0)
			{
				isprime=false;
				break;
				
			}
		}
		if(isprime)
			System.out.println(num+ "is a primenumber");
		else
			System.out.println(num+ "is not a primenumber");
}
}