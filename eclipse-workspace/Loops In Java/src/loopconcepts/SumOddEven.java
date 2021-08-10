package loopconcepts;

import java.util.Scanner;

public class SumOddEven {

	public static void main(String[] args) {
		
		int limit;
		int sum = 0;
		int total = 0;
		
		System.out.println("Enter the limit : ");
		Scanner sc = new Scanner(System.in);
		limit = sc.nextInt();
		
		for(int i=0;i<=limit;i++) {
			if(i%2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("The sum of odd numbers are : "+sum);
		
		for(int j=0;j<=limit;j++) {
			if(j%2 == 0) {
				total = total + j;
			}
		}
		System.out.println("The sum of even numbers are : "+total);
				

	}

}
