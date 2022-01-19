package myfirstprogram;
import java.util.Scanner;
public class palindrome {
	
	    public static void main(String args[])
	    {
	        String str="madam";
	        int start=0;
	        int end=str.length()-1;
	        boolean ispalindrome=true;
	        while(start<end) {
	        	if(str.charAt(start) !=str.charAt(end)) {
	        		ispalindrome=false;
	        		break;
	        	}
	        	start++;
	        	end--;
	        	
	        }
	        if(ispalindrome) {
	        	System.out.println("madam is a palindrome");
	        }else {
	        	System.out.println("madam is not a palindrome");
	        }
}
}
