package myfirstprogram;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		int number;
		System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		long factorial=1;
		int i=1;
		while(i<=number)
		{
			factorial=factorial*i;
			i++;
		}
		System.out.println("factorial of "+number+"  is:"+factorial);
	}

}
