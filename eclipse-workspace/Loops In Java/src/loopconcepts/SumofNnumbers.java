package loopconcepts;

import java.util.Scanner;

public class SumofNnumbers {

	public static void main(String[] args) {
		
		int n;
		int sum = 0;
		System.out.println("Enter the limit : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			sum = sum + i;
		}
		
		System.out.println("The sum of n numbers are : "+sum);

	}

}
