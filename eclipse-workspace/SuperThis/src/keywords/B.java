package keywords;

public class B extends A {

	int a = 570;
	
	public void value(int a) {
		//this.a = a;
		
		System.out.println("The value of a is : "+a);
		System.out.println("The value of a is : "+this.a);
		System.out.println("The value of a is : "+super.a);
	}
	public static void main(String[] args) {

		B b = new B();
		b.value(357);
		
		
	}

}
