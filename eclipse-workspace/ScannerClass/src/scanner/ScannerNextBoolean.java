package scanner;

import java.util.Scanner;

public class ScannerNextBoolean {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please make sure if its true or false : ");
		Boolean bol = sc.nextBoolean();
		
		System.out.println("The entered statements are : "+bol);
		sc.close();

	}

}
