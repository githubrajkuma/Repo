package newJavaPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList5 {

	public static void main(String[] args) {

		// creating an ArrayList
		ArrayList<Object> obj = new ArrayList<Object>();

		// Adding object in ArrayList
		obj.add(1);
		obj.add("Selenium");
		obj.add("Java");
		obj.add(22);
		obj.add(15);

		// Printing ArrayList Element - 1st way
		System.out.println(obj);

		// Priting ArrayList Element -2nd way
		Iterator suj = obj.iterator();

		while (suj.hasNext()) {
			System.out.println("Using iterator and while loop:-" + suj.next());

		}

		for (Object bcd : obj) {

			System.out.println("Using for loop:-" + bcd);

		}

	}

}
