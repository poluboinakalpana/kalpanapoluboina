package myfirstprogram;
import java.util.Scanner;
public class split {
	
        public static void main(String args[]) {

              

                  String str_split = new String("java datastructures python");

                  System.out.println("The string after split :\n" );     

                 

                  for (String str: str_split.split(" ")) {

                     System.out.println(str);

                  }

               }

}