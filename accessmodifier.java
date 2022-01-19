package myfirstprogram;



public class accessmodifier {
	//1. Class is having Default access modifier 
	class defAccessSpecifier
	{ 
	  void display() 
	     { 
	         System.out.println("You are using defalut access specifier"); 
	     } 
	} 

	public class accessSpecifiers1 {

		public static void main(String[] args) {
			//default
			System.out.println("Dafault Access Specifier");
			def accessmodifier obj = new accessmodifier(); 		  
	        obj.display(); 

		}
	}


	//2. using private access specifiers
	class priaccessspecifier 
	{ 
	   private void display() 
	    { 
	        System.out.println("You are using private access specifier"); 
	    } 
	} 

	public class accessSpecifiers2 {

		public static void main(String[] args) {
			//private
			System.out.println("Private Access Specifier");
			accessmodifier  obj = new accessmodifier(); 
	        //trying to access private method of another class 
	        //obj.display();

		}
	}


	//3. using protected access specifiers

	public class proaccessspecifiers {

		protected void display() 
	    { 
	        System.out.println("This is protected access specifier"); 
	    } 
	}

	//create another package

	
	public class accessSpecifiers4 {

		public static void main(String[] args) {
			
			accessmodifier obj = new accessmodifier();
			
	        //obj.display();
	}

	}
}
