package overloading;

public class Test extends Example {
	
	public int findSum(int k, int m, int n) {
		return (k+m+n);
	}

	public static void main(String[] args) {
		Example e = new Example();
		System.out.println(e.findSum(20,30));
		System.out.println(e.findSum(40, 10, 50.567));
		System.out.println(e.findSum(500.762, 691.7280));

		System.out.println(e.findSum(80, 40, 50));
	}

}
