package scanner;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int number;
		int mul;
		int i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		number = sc.nextInt();
		
		System.out.println("The multiplication table of "+number+" is : ");
		
		for(i=1;i<=10;i++) {
			mul = i * number;
			System.out.println(i+"*"+number+"="+mul);
		}
		
		sc.close();
		

	}

}
