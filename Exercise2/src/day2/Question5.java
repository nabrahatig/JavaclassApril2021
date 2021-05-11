package day2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		/*
		 * Write a Java program which reads two integers from the user and prints the
		 * sum and difference both in their own line. Example Enter first number: 7
		 * Enter second number: 6 Sum: 13 Difference: 1
		 */

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the first number:");

		// Prompt the user
		int num1 = input.nextInt();

		System.out.print("Please enter the second number:");
		int num2 = input.nextInt();

		int sum = num1 + num2;
		int sub = num1 - num2;

		System.out.println("Sum of num1 and num2 is = " + sum);
		System.out.println("Difference of num1 and num2 is = " + sub);

		input.close();

	}

}
