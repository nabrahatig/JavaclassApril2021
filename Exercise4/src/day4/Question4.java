package day4;

public class Question4 {

	public static void main(String[] args) {
		//Write a Java program to copy an array by iterating the array. Arr1 [3, 4,5,2] Arr2 [null, null, null, null]

		String myArray1[] = { "Rahwa", "Lula", "Ziyda" };

		// print original intArray
		System.out.println("Original Array of elements ");
		for (int i = 0; i < myArray1.length; i++)
			System.out.print(myArray1[i] + " ");

		// Create an array myArray2 of same size as myArray
		String myArray2[] = new String[myArray1.length];

		// Coping Array

		System.out.println("\nCopied from the original array of elementsy ");
		for (int i = 0; i < myArray2.length; i++)
			System.out.print(myArray2[i] + " ");
	}

}
