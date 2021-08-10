package markcalculation;

public class Marks {

	public static void main(String[] args) {
		 
		float[] sub = {56,89,42,95,77};
		
		float total = 0;
		
		float avg;
		
		
		
		for(int i=0;i<sub.length;i++) {
			total = total + sub[i];
		}
		
		avg = total / sub.length;
		
		System.out.println("The average score of the student is : "+avg);
				
	}

}
