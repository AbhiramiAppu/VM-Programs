package interfaces;

public class SecondClass implements SecondInterface,ThirdInterface,FourthInterface {
	
	public void method1() {
		System.out.println("This is the method in SecondInterface");
	}
	
	public void method2() {
		System.out.println("This is the method in ThirdInterface");
	}
	
	public void method3() {
		System.out.println("This is the method in FourthInterface");
	}
	
	public void method4() {
		System.out.println("This is the Class Method");
	}

	public static void main(String[] args) {
		
		SecondClass sc = new SecondClass();
		sc.method1();
		sc.method2();
		sc.method3();
		sc.method4();

	}

}
