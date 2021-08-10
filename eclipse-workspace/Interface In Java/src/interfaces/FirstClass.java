package interfaces;

public class FirstClass implements FirstInterface {
	public void display() {
		System.out.println("This is the method of Interface");
		
	}
	
	void show() {
		System.out.println("This is the method of Class");
	}

	public static void main(String[] args) {
		FirstClass f = new FirstClass();
		f.display();
		f.show();

	}

}
