package ConditionalStatements;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int num;
		int flag = 0;
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i=2;i<num;i++) {
			if(num%i == 0) {
				flag = 1;
				break;
			}
		}
		
		if(num == 1 || num == 0) {
			System.out.println("The entered number "+num+" is neither Prime nor Composite");
		}else if(flag == 0) {
			System.out.println("The entered number "+num+" is Prime");
		}else {
			System.out.println("The entered number "+num+" is Not Prime");
		}

	}

}
