package staticconcept;

public class Employee {

	String name;
	int id;
	String companyName = "UST Global";
	
	public Employee(String n, int i) {
		name = n;
		id = i;
	}
	
	void display() {
		System.out.println("Name is : "+name);
		System.out.println("Id is : "+id);
		System.out.println("Company Name is : "+companyName);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee("Abhi",501);
		e.display();
		Employee e1 = new Employee("Appu",845);
		e1.display();


	}

}
