package staticconcept;

public class StaticMethod {
	
	int x = 500;
	static int y = 1000;
	
	void display() {
		System.out.println("The value of instance variable x is : "+x);
		System.out.println("The value of static variable y is : "+y);
		
	}
	
	static void show() {
		//System.out.println("Instance variable x is : "+m.x); //cannot be called because its a static method
		System.out.println("Static variable y is : "+y);
	}

	public static void main(String[] args) {
		StaticMethod m = new StaticMethod();
		m.display();
		show();

	}

}
