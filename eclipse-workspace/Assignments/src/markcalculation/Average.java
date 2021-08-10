package markcalculation;

public class Average {

	public static void main(String[] args) {
		
	double marks[] = new double[5];
		
		marks[0] = 56.3;
		marks[1] = 78.5;
		marks[2] = 89.2;
		marks[3] = 99;
		marks[4] = 45.5;
		
	double total =0;
	
	double avg;
	for(int i=0;i<marks.length;i++) {
		total = total + marks[i];
	}
	
	avg = total / marks.length;
	
	System.out.println("The average score of the student is : "+avg);
			
	
	}

}
