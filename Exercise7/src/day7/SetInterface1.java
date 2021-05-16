package day7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface1 {

	public static void main(String[] args) {

		// Creating HashSet
		// adding random elements
		Set<String> myset = new HashSet<>();
		myset.add("A");
		myset.add("F");
		myset.add("A");
		myset.add("D");
		myset.add("F");
		myset.add("C");
		myset.add("B");
		System.out.println(myset);
		System.out.println("The Given Values of Hashset: " + myset);
		
		}
	}
	
		