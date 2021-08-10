package Operators;

public class Unary {

	public static void main(String[] args) {

		int i = 10;
		System.out.println("Value of i when i++ : "+ (i++));// i= 10+1=11...value of i is 10
		System.out.println("Value of i when ++i : "+ (++i));// i= 1+11=12.....value of i is 12
		System.out.println("Value of i when i-- : "+ (i--));// i = 12-1=11....value of i is 12
		System.out.println("Value of i when --i : "+ (--i));// i = 12-1= 10....value of i is 10
	}

}
