package staticconcept;

public class StaticVariable {
	
	static int x = 10;
	int y = 20;
	
	

	public static void main(String[] args) {
		
		System.out.println("The Static Variable is : "+StaticVariable.x);
		StaticVariable s = new StaticVariable();
		System.out.println("The Instance variable is : "+s.y);

	}

}
