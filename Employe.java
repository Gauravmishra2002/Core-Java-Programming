package Practice_Day25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Employe {

	public static void main(String[] args) {
		// Create an arraylist to employe list
		
		ArrayList<String> employelist = new ArrayList<>();
		
		// Add 10 employe to the arraylist
		employelist.add("Gaurav");
		employelist.add("Yogesh");
		employelist.add("Omkar");
		employelist.add("Ashish");
		employelist.add("Nehal");
		employelist.add("Muskan");
		employelist.add("Akash");
		employelist.add("Rahul");
		employelist.add("Kartik");
		employelist.add("Ishwari");
		
		// display arraylist
		System.out.println("Employe list is : \n"+employelist);
		
		// sorting data
		Collections.sort(employelist);
		System.out.println("Sorting 1 : "+employelist);
		
		// methods
		System.out.println("Total size of list : "+employelist.size());
		
		System.out.println("Get element : "+ employelist.get(0));
		
		employelist.set(0, "Gaurav");
		
		employelist.remove(0);
		System.out.println();
	}

}
