package myfirstprogram;

import java.util.Scanner;

public class calculate {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		
		int firstNumber = scan.nextInt();
		int secondNumber = scan.nextInt(); 
		
		int result = firstNumber + secondNumber;
		
		System.out.println("Addition of numbers is : " + result);
		
	}

}
