package day4;

public class Question3 {

	public static void main(String[] args) {
		// Question3
		// Write a Java program to find the index of an array element.

		// DataType Variable = Value

		int[] myArray = { 2, 4, 6, 8, 10 };

		int x = 10;

		int index = 0;

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] == x) {
				index = i;
			}

		}
		System.out.println("The index of X " + x + " " + "is: " + index);

	}

}
