package scanner;

import java.util.Scanner;

public class ScannerNextInt {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Phone Number : ");
		int phno = sc.nextInt();
		
		System.out.println("Your Phone Number is : "+phno);
		sc.close();

	}

}
