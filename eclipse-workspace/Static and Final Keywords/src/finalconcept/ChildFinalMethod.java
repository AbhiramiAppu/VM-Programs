package finalconcept;

public class ChildFinalMethod extends FinalMethod{
	/*public final void show() {
		System.out.println("The value of variable is : "+var);
	}*/                              //final method cannot be overridden
	
	public void display() {
		System.out.println("This is the overridden normal method");
	}

	public static void main(String[] args) {
		ChildFinalMethod pf = new ChildFinalMethod();
		pf.show();
		pf.display();
		
		FinalMethod f = new FinalMethod();
		f.display();
		f.show();

	}

}
