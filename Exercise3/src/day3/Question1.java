
package day3;

public class Question1 {

	public static void main(String[] args) {
		// write a java program to calculate the sum of first 10 integers.
		// the program should calculate the sum using for loop.Sum:55
		// DataType variable =value

		/*
		 * for (int i = 0; i <= 10; i++) { System.out.println(i);
		 * 
		 * 
		 * }
		 */

		int sum = 0;

		for (int i = 0; i <= 10; i++) {

			sum = sum + i;
		}
		System.out.println("Sum: " + sum);
	}

}
