package finalconcept;

public final class FinalClass {
	
	int a = 50;
	
	public void show() {
		System.out.println("This is final class variable and the value is : "+a);
	}

	/*public class Demo extends FinalClass{
		
	}*/                 //the class declared as final cannot be inherited
	
	public static void main(String[] args) {
		FinalClass f = new FinalClass();
		f.show();
	}







}
