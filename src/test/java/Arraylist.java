package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Arraylist {
	
	public static void main(String[] args) {
		ArrayList<String> listofcountries = new ArrayList<String>();
		   listofcountries.add("two");
		   listofcountries.add("one");
		   listofcountries.add("three");
		   listofcountries.add("four");
		   System.out.println("After Sorting:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}
		   Collections.sort(listofcountries,new StringSort());
		   System.out.println("After Sorting:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}

	}

}


