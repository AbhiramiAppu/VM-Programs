package arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Audi");
		System.out.println("The ArrayList elements are : "+cars);
		System.out.println("The third element in the list is : "+cars.get(2));
		cars.set(2,"Benz");
		System.out.println("After setting , the array elements are : "+cars);
		System.out.println("The length of array list is : "+cars.size());
		cars.remove(0);
		System.out.println("After removing the first element, the list contains : "+cars);
		cars.clear();
		System.out.println("After clearing all elements from array list : "+cars);
	

	}

}
