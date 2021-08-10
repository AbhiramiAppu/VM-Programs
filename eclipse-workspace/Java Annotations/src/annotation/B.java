package annotation;

public class B extends A{
	
	public void method() {
		System.out.println("This is the Child Class Method");
	}

	public static void main(String[] args) {
		B b = new B();
		b.method();

	}

}
