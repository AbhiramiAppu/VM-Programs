package loopconcepts;

public class Loops {

	public static void main(String[] args) {

		int num = 10;
		int i = 1;
		
		System.out.println("The first 10 natural numbers are : ");
		while(i <= num)
		{
			System.out.println(i);
			i++;
		}
		
		int var = 20;
		System.out.println("The numbers between 10 and 20 are : ");
		do 
		{
			System.out.println(i);
			i++;
		} while(i < var);
		
		System.out.println("The values of j are : ");
		for(int j=0;j<=10;j++)
		{
			System.out.println(j);
		}
	}

}
