package upcasting;

public class Upcast {

	public static void main(String[] args) {

		Parent p1 = (Parent) new Child();
		p1.showvalue();
		Parent p2 = new Parent();
		p2.showvalue();
		Child c1 = new Child();
		c1.showvalue();
		//Child c2 = (Child) new Parent(); //it will show error ie,ClassCastException - DownCasting
		//c2.showvalue();
	}

}
