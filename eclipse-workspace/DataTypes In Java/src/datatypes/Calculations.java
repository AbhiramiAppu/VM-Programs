package datatypes;

public class Calculations {

	public static void main(String[] args) {
		byte b = 3;
		short s = 245;
		int i = 78913;
		long l = 572419537;
		
		char c = 'C';
		String str = "Hello";
		
		float f = 9.35f;
		double d = 8627.2194;
		
		boolean bol = true;
		
		System.out.println("The sum of b + s is :"+b+s);
		System.out.println("The difference between l and i is :"+(l-i));
		System.out.println("The double value of b is "+(2*b));
		System.out.println(str+" "+c+"....Is it "+bol);
		System.out.println("When we divide d by f, we get "+(d/f));

	}

}
