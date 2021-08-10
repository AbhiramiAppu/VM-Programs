package narrowing;

public class Narrowing {

	public static void main(String[] args) {
		
		double d =429.715;
		long l = (long)d;
		
		int a = (int)l;
		
		System.out.println("Before Narrowing casting the double value of a is "+d);
		System.out.println("After Widening casting the long value of a is "+l);
		System.out.println("After Widening casting the int value of a is "+a);

	}

}
