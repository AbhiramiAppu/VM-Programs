package overloading;

public class Sum {
	
	public int findSum(int a, int b) {
		return (a+b);
	}
	
	public float findSum(int x, int y, float z) {
		return (x+y+z);
	}
	
	public double findSum(double c, double d) {
		return (c+d);
	}



	public static void main(String[] args) {
		
		Sum s = new Sum();
		System.out.println(s.findSum(20,30));
		System.out.println(s.findSum(40, 10, 50));
		System.out.println(s.findSum(500.762, 691.7280));

	}

}
