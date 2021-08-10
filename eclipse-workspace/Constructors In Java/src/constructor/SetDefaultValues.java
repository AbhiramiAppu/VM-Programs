package constructor;

public class SetDefaultValues {
	
	String name = "Abhirami";
	int sal = 25000;
	double bal = 56973.291;
	
	String address;
	int age;
	double amt;
	
	public void show() {
		System.out.println("Name is : "+name);
		System.out.println("Salary is : "+sal);
		System.out.println("Balance is : "+bal);
		System.out.println("Address is : "+address);
		System.out.println("Age is : "+age);
		System.out.println("Amount is : "+amt);
	}

	public static void main(String[] args) {
		SetDefaultValues s = new SetDefaultValues();
		s.show();

		
	}

}
