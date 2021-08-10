package threading;

public class ExceptionThread {
	
	public static void main(String[] args) {
		
		Sample s = new Sample();
		s.start();
		while(s.isAlive()) {
			try {
				s.sleep(10);
			}
			catch(Exception e) {
				System.out.println("Sleeping thread is interrupted");
			}
			
			System.out.println("Sleeping demo is finished");
		}
	}

}
