package myfirstprogram;
import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		

//		int []arr = new int[5];
//		
//		arr[0] = 98;
//		arr[1] = 101;
//		arr[2] = 976;
//		arr[3] = 9090;
//		arr[4] = 45;
//		
	//System.out.println(arr[3]);
		
		int []arr;
		
		arr = new int[3];
		
		int []values = {56, 99, 181, 87};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter three numbers");
		for(int index = 0; index < arr.length; index++) {
			arr[index] = scan.nextInt();
		}
		
		System.out.println("You entered the numbers as :");
//		for(int index = 0; index < arr.length; index++) {
//			System.out.println(arr[index]);
//		}
		
//		Java 5's enhanced for loop
//		for(Variable declaration : name of array/collection) {
//			
//		}
		
		for(int value : arr) {
			System.out.println(value);
		}
		
		
	}
	

}
