package billgenerator;

public class Bill {

	public static void main(String[] args) {

		int units = 250;
		float charge = 0;
		if(units<100) {
			System.out.println("No charges.....Free current");
		}
		
		else if(units>100 && units<300)
		{
			charge = units * 2;
			System.out.println("Electricity charge = "+charge);
		}
		else{
			charge = units * 3;
			System.out.println("Electricity charge = "+charge);
		}
		
	}

}
