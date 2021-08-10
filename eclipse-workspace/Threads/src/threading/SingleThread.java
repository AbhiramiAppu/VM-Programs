package threading;

public class SingleThread extends Thread{
	
	public void run() {
		System.out.println("This is the New Running Thread");
	}

	public static void main(String[] args) {
		
		SingleThread s = new SingleThread();
		s.start();

	}

}
