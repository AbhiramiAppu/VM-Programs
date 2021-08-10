package exception;

public class UncheckedException {

	public static void main(String[] args) {
		try
		{
			int a = 10;
			int b = 0;
			int c = a/b;
			System.out.println("The value of c is : "+c);
		}
		catch(ArithmeticException e) {
			System.out.println("Ok ....Let it go!!");
		}
		
		System.out.println("This is my rest of program.....continuous");

	}

}
