package scanner;

import java.util.Scanner;

public class MonthsAndDays {

	public static void main(String[] args) {
		int number;
		int days;
		int months;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input : ");
		
		number = sc.nextInt();
		
		months = number / 30;
		days = number % 30;
		
		System.out.println("The number of months : "+months);
		System.out.println("The number of days is :"+days);
		
		sc.close();

	}

}
