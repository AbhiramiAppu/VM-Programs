package StringsInJava;

public class Concat {

	public static void main(String[] args) {

		String s = " I am";
		String t = " string type";
		System.out.println(s+t);
		
		int a = 1357;
		int b = 4832;
		System.out.println(a+b);
		
		System.out.println(a+b+s+t);
		System.out.println(s+t+a+b);
		System.out.println(s+t+(a+b));
	}

}
