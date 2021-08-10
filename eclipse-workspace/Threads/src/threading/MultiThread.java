package threading;

public class MultiThread {

	public static void main(String[] args) {
		
		DemoThread dt1 = new DemoThread(1);
		DemoThread dt2 = new DemoThread(2);
		DemoThread dt3 = new DemoThread(3);
		
		dt1.start();
		dt2.start();
		dt3.start();

	}

}
