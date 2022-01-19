package phase1projects;

public class innerclassAssisted1 {
	

		 private String msg="Welcome to Java"; 
		 
		 class Inner{  
		  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
		 }  


		public static void main(String[] args) {

			innerclassAssisted1 obj=new innerclassAssisted1();
			innerclassAssisted1.Inner in=obj.new Inner();  
			in.hello();  
		}
	}


	public class innerclassAssisted2 {

	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  

	 
	public static void main(String[] args) {
		innerclassAssisted2  ob=new innerclassAssisted2 ();  
		ob.display();  
		}
	}


	//anonymous inner class
	abstract class AnonymousInnerClass {
		   public abstract void display();
		}


		public class innerclassAssisted3 {

		public static void main(String[] args) {
		AnonymousInnerclass i = new AnonymousInnerclass() {

		         public void display() {
		            System.out.println("Anonymous Inner Class");
		         }
		      };
		      i.display();
		   }
		}




