package loopconcepts;

import java.util.Scanner;

public class ReverseStar {

	public static void main(String[] args) {
		
		int limit;
		System.out.println("Enter the limit : ");
		Scanner sc = new Scanner(System.in);
		limit = sc.nextInt();
		
		for(int i=limit;i>=1;i--) 
		{
			for(int j=i;j>=1;j--) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}


	}

}
