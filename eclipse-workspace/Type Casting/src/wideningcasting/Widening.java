package wideningcasting;

public class Widening {
	

	public static void main(String[] args) {
		
		int a = 837;
		
		
		long l = a;
		
		double d = l;

		
		System.out.println("Before Widening casting the int value of a is "+a);
		System.out.println("After Widening casting the long value of a is "+l);
		System.out.println("After Widening casting the double value of a is "+d);

	}

}
