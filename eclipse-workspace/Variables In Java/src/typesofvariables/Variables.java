package typesofvariables;

public class Variables {
	
	int a = 52104;                  //instance or global variable :- declared outside method and inside class
	
	static int b = 783;             //static variable :- declared using the keyword static
	

	public static void main(String[] args) {
		
		int c = 36 ;               //local variable :- declared inside the method

		Variables v = new Variables();  //instance variables are accessed inside main method by creating objects
		
		System.out.println("The Instance or Global variable is : "+v.a);
		
		System.out.println("The Static variable is : "+b); //static variables are accessed without creating objects
	
		System.out.println("The Local variable is : "+c);
	
	}

}
