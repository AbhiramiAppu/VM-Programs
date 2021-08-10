package ConditionalStatements;

public class LargestThree {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 7834;
		int num3 = 3801564;
		
		if (num1 > num2) {
			
		    if(num1 > num3) {
		    	System.out.println(num1+" is largest of three numbers");
		    }
		    else {
		    	System.out.println(num3+" is largest of three numbers");
		    }
		    
		}else{
			if(num2>num3) {
				System.out.println(num2+" is largest of three numbers");
		}else {
			System.out.println(num3+" is largest of three numbers");
		}
	}
		}
	

}
