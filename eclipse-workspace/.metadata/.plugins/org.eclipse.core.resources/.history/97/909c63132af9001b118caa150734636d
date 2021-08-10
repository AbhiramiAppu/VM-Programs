package exception;

public class ThrowException {
	
	static int sum(int bal, int withdraw) {
		if(bal <= 1000) {
			throw new ArithmeticException("Your balance is too low, can't able to withdraw");
		}else {
			System.out.println("Eligible to withdraw");
			return bal-withdraw;
		}
	}

	public static void main(String[] args) {
		int total = sum(600,1500);
		System.out.println(total);
		System.out.println("Continue further transactions");
		

	}

}
