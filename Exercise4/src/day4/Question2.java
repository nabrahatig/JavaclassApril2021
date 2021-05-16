package day4;

public class Question2 {

	public static void main(String[] args) {
		/*
		 * Question Write a Java program to test if an array contains a specific value.
		 */
		// DataType Variable = Value
		//

		int[] myArray = new int[10];

		myArray[0] = 6;

		myArray[1] = 12;

		myArray[2] = 14;

		myArray[3] = 7;

		myArray[4] = 16;

		myArray[9] = 19;

		int x = 50;
		boolean check = false;

		for (int i : myArray) {
			if (i == x) {
				check = true;
				break;
			}
		}

		if (check) {
			System.out.println("The given number is found");
		} else {
			System.out.println("The given number is not found");
		}

	}

}
