package Operators;

public class Logical {

	public static void main(String[] args) {

		int c = 50;
		int d = 25;
		int e = 67;
		int f = 78;
		

		System.out.println("c == d && e != f : "+(c==d && e!=f)); //one is wrong and other is right....so returns false
		System.out.println("c > d && e != f : "+(c>d && e!=f));//both statements are true......so returns true
		
		
		System.out.println("c == d || e != f : "+(c==d || e!=f));//one is right and other is wrong.....so returns true 
		System.out.println("c < d || e == f : "+(c==d || e==f));//both statements are false.....so returns false
		
		System.out.println("c == d && e != f : "+!(c==d&&e!=f));//one is right and other is wrong...result is false...so it returns true
		System.out.println("c > d && e != f : "+!(c>d && e!=f));//both statements are true....so returns false
	}

}
