package day2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		/*
		 * Write Java program to allow the user to input his/her age. Then the program
		 * will show if the person is eligible to vote. A person
		 */
		/*
		 * who is eligible to vote must be older than or equal to 18 years old/*
		 * 
		 */

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter your age: ");

		// Prompt the user
		int age = input.nextInt();

		if (age >= 18) {
			System.out.println("You are eligible to vote");
		} else {
			System.out.println("You must be order than or equal to 18 years old to vote");
		}

		input.close();

	}

}