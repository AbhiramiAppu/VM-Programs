package twodimensional;

public class SecondArray {

	public static void main(String[] args) {

		int[][] num = {{10,20,30},{30,40,50}};
		System.out.println("The length of the row is : "+num.length);
		System.out.println("The length of the column is : "+num[1].length);
		System.out.println("The array elements are : ");
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[1].length;j++) {
				
			System.out.print(num[i][j]+"  ");
		}
			System.out.println();
				}
	}

}
