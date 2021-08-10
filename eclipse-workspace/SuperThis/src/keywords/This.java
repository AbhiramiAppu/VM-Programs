package keywords;

public class This extends Super {
	
	int age = 20;
	
	public void showage() {
		int age = 10;
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
	}

	public static void main(String[] args) {
		
		This t = new This();
		t.showage();

	}

}
