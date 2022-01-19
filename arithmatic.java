package myfirstproject;
import java.util.Scanner;
public class arithmatic {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
//			double Ans;
			Scanner sc=new Scanner(System.in);
			System.out.println("eneter the two numbers");
			int firstnum=sc.nextInt();
			int secondnum= sc.nextInt();
			System.out.println("Enter the operator ");
			char op=sc.next().charAt(0);
			double Ans=0;

			switch(op){
			case '+': Ans=firstnum+secondnum;
			break;
			case '-':Ans=firstnum-secondnum;
			break;
			case '*': Ans=firstnum*secondnum;
			break;
			case '/':Ans=firstnum/secondnum;
			break;
			}
			System.out.println("the answer is " +Ans);

	}



}
