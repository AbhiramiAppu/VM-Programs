package ConditionalStatements;

public class elseifladder {

	public static void main(String[] args) {

		int bal = 80000000;
		
		if (bal > 1000 && bal < 100000) {
			
			System.out.println("Sufficient balance");
		}
		
		else if(bal == 0) {
			
			System.out.println("Acount invalid");
		}
		
		else if(bal > 100000) {
			
			System.out.println("Over credit");
		}
		
		else {
			
			System.out.println("Insufficient balance");
		}
	}

}
