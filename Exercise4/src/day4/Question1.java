package day4;

public class Question1 {

	public static void main(String[] args) {
		// Write a Java program to calculate the average value of array integers.

		// Array is a collection
		// Array = used to store multiple vales in a single variable

		// int[] grades;
		// int is a type
		// DataType Variable = value
		// { "Apple", "Banana", "orange", "Blueberry"};

		int[] myArray = new int[4];

		myArray[0] = 10;
		myArray[1] = 15;
		myArray[2] = 35;
		myArray[3] = 20;

		// int average = (myArray[0] + myArray[1] + myArray[2] + myArray[3])/4;
		int sum = 0;

		for (int i = 0; i < myArray.length; i++) {
			sum = sum + myArray[i];
		}

		int average = sum / myArray.length;

		System.out.println("The average of an array elements is = " + average);

	}

}
