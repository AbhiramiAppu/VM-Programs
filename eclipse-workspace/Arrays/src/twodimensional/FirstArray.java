package twodimensional;

public class FirstArray {

	public static void main(String[] args) {


		int a[][] = new int[3][3];
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		
		a[1][0] = 40;
		a[1][1] = 50;
		a[1][2] = 60;
		
		a[2][0] = 70;
		a[2][1] = 80;
		a[2][2] = 90;
		

		System.out.println("The length of the row is : "+a.length);
		System.out.println("The length of the column is : "+a[1].length);
		System.out.println("The array elements are : ");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[1].length;j++) {
				
			System.out.print(a[i][j]+"  ");
		}
			System.out.println();
				}

	}

}
