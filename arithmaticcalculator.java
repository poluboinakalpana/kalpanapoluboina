package myfirstproject;
import java.util.*;
public class arithmaticcalculator {
	public static void main(String[] args)
	{
		System.out.println("enter a, b values");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt ();
		int b=sc.nextInt ();
		System.out.println("addition of "+a+" and "+b+" is " +(a+b));
		System.out.println("multiplication of "+a+" and "+b+" is " +(a*b));
		System.out.println("subtraction of "+a+" and "+b+" is " +(a-b));
		System.out.println("division of "+a+" and "+b+" is " +(a/b));



	}

}
