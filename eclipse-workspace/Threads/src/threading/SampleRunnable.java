package threading;

public class SampleRunnable implements Runnable{
	int a;

	public SampleRunnable(int a) {
		this.a = a;
	}
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Count = "+i+" Thread = "+a);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
