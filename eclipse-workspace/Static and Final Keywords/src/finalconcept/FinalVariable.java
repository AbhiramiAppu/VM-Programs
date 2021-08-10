package finalconcept;

public class FinalVariable {
	
	int x = 300;
	final int y = 600;
	
	void change() {
		System.out.println("The value of Instance variable before change is : "+x);
		x = 500;
		//y = 930; //the value of final variable cannot be changed
		System.out.println("The value of Instance variable after change is : "+x);
		System.out.println("The value of Final variable is : "+x);
	}

	public static void main(String[] args) {
		FinalVariable f = new FinalVariable();
		f.change();

	}

}
