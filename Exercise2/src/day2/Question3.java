
package day2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		/*
		 * Write a Java program to get a number from the user and print whether it is
		 * positive or negative
		 */

		// String
		// Create Scanner Object

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the number to know whether it is positive or negative: ");

		// Prompt the user
		int n = input.nextInt();

		if (n >= 0) {
			System.out.println("The number you enter is Positive: ");
		} else {
			System.out.println("The number you enter is Negative: ");
		}

		input.close();

	}

}
