package arrayList;

import java.util.LinkedList;

public class LinkedListMethods {
	
	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Audi");
		System.out.println("The ArrayList elements are : "+cars);
		System.out.println("The third element in the list is : "+cars.get(2));
		cars.set(2,"Benz");
		System.out.println("After setting , the array elements are : "+cars);
		cars.add(1,"Mazda");
		System.out.println("Now the ArrayList elements becomes : "+cars);
		System.out.println("The length of array list is : "+cars.size());
		cars.remove(0);
		System.out.println("After removing the first element, the list contains : "+cars);
		cars.addLast("Opel");
		System.out.println("By adding one element to the last position of the array : "+cars);
		cars.clear();
		System.out.println("After clearing all elements from array list : "+cars);
	

	}

}
