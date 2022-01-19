package myfirstprogram;

import java.util.Scanner;

public class trafficlight {
	public static void main(String[]  args) {
		System.out.println("1.red");
		System.out.println("2.yellow");
		System.out.println("3.green");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice:");
		String choice=sc.nextLine();
		if(choice.equals("red"))
			System.out.println("stop");
		if(choice.equals("yellow"))
			System.out.println("ready");
		if(choice.equals("green"))
			System.out.println("go");


	}

}
