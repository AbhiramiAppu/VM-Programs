package onedimensional;

public class Sum {

	public static void main(String[] args) {

		int[] a = {20,40,60,80};
		int[] b = {10,30,50,70};
		int[] c = new int[100];		
		for(int i=0;i<5;i++) {
			c[i] = (a[i] + b[i]); 
			System.out.println(c[i]);
		}
		
		
		}
	
}
