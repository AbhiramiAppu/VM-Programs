package loopconcepts;

import java.util.Scanner;

public class StarPrinting {

	public static void main(String[] args) {
		int limit;
		System.out.println("Enter the limit : ");
		Scanner sc = new Scanner(System.in);
		limit = sc.nextInt();
		
		for(int i=1;i<=limit;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
