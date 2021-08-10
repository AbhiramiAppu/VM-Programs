package scanner;

import java.util.Scanner;

public class ScannerNextFloat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of pi : ");
		float pi = sc.nextFloat();
		
		System.out.println("The value of pi is : "+pi);
		sc.close();


	}

}
