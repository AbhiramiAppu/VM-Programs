package downcasting;

public class Downcast {

	public static void main(String[] args) {

		Parent p = new Child();
		Child c = (Child) p;
		c.showvalue();
		c.showvalue1();
		
	}

}
