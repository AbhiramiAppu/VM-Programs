package abstraction;

public class Details {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setName("Abhirami");
		emp.setEmpid(123456);
		emp.setAccno(679238419);
		emp.setBankname("HDFC Bank");
		emp.setSalary(25000);
		
		System.out.println("The employee name is : "+emp.getName());
		System.out.println("The employee uid is : "+emp.getEmpid());
		System.out.println("The employee account number is : "+emp.getAccno());
		System.out.println("The employee bank is : "+emp.getBankname());
		System.out.println("The employee salary is : "+emp.getSalary());
			
	}

}
