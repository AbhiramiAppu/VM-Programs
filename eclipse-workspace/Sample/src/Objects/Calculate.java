package Objects;

public class Calculate {


	public static void main(String[] args) {

		 Calculate addition = new Calculate();
		 addition.add();

		 Calculate subtraction = new Calculate();
		 subtraction.sub();

		 Calculate multiplication = new Calculate();
		 multiplication.mul();

		 Calculate division = new Calculate();
		 division.div();
		
	}
  
	public void add() {
		int a =  10;
		int b = 20;
		int c = (a+b);
		System.out.println("Addition is : "+c);
	}
	
	public void sub() {
		int a1 =  10;
		int b1 = 20;
		int c1 = (a1 - b1);
		System.out.println("Subtraction is : "+c1);
	}
	
	public void mul() {
		int a2 =  10;
		int b2 = 20;
		int c2 = (a2 * b2);
		System.out.println("Multiplication is : "+c2);
	}
	
	public void div() {
		int a3 =  20;
		int b3 = 10;
	    float c3 = (a3 / b3);
		System.out.println("Division is : "+c3);
	}
}
