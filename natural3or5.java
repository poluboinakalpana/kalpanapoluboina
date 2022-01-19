package myfirstprogram;

import java.util.Scanner;

public class natural3or5 {

	public static void main(String[] args) {
		CalculateTheSumOfFirstNaturalNumberWhichAreDivisibleBy3Or5 p1 = new CalculateTheSumOfFirstNaturalNumberWhichAreDivisibleBy3Or5();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("The sum of Given natural Number which are Divisible by 3 or 5 is "+p1.calSum(n));

	}

	private int a=0;
	public int calSum(int n)
	{
		for (int i=0; i<=n; i++)
		{
			if(i%3==0 || i%5==0) {
				a +=i;
			}
		}
		return a;
	}
	