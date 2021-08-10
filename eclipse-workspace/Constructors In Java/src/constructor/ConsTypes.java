package constructor;

public class ConsTypes {
	
	

	public ConsTypes() {
		System.out.println("This is the Default Constructor");
	
	}
	
	public ConsTypes(int a, int b) {
		System.out.println("This is Parameterized Constructor");
		System.out.println("The vale of a is : "+a);
		System.out.println("The vale of b is : "+b);
	}
	
	public ConsTypes(double c, double d) {
		System.out.println("This is another Parameterized Constructor");
		System.out.println("The vale of c is : "+c);
		System.out.println("The vale of d is : "+d);
	}
	

	public static void main(String[] args) {
		ConsTypes c = new ConsTypes();
		ConsTypes c1 = new ConsTypes(10,30);
		ConsTypes c2 = new ConsTypes(5.893,904.216);

	}

}
