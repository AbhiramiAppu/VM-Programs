package threading;

public class ImplementsRunnableInterface {

	public static void main(String[] args) {
		
		SampleRunnable sr1 = new SampleRunnable(1);
		Thread t1 = new Thread(sr1);
		
		SampleRunnable sr2 = new SampleRunnable(2);
		Thread t2 = new Thread(sr2);
		
		SampleRunnable sr3 = new SampleRunnable(3);
		Thread t3 = new Thread(sr3);
		
		t1.start();
		t2.start();
		t3.start();

	}


}
