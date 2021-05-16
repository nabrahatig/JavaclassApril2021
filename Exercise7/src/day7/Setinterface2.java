package day7;

import java.util.HashSet;
import java.util.Set;

public class Setinterface2 {

	public static void main(String[] args) {
		
		//Given Two sets below two setsSet1: [3,4,5,7,8,9]Set2 [5,2,4,6,7,11
		//Find the intersection in those setsb.Find 
		//the union in those sets c.Find the only unique elements in set2
		
		//first set 
	Set<Integer> myset1 = new HashSet<>();
	myset1.add(3);
	myset1.add(4);
	myset1.add(7);
	myset1.add(8);
	myset1.add(9);
	System.out.println("unique ng myset: "+ myset1);

	//second set
	
	Set<Integer> myset2 = new HashSet<>();
	
	myset2.add(5);
	myset2.add(2);
	myset2.add(4);
	myset2.add(6);
	myset2.add(7);
	myset2.add(11);
	System.out.println("unique ng myset: "+ myset2);
	//union of two sets
	myset1.addAll(myset2);
	System.out.println("all union is:" +myset2);
	
	
	
	
	
	
	
	

	}

}
