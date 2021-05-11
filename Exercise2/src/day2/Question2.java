package day2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		/*
		 * Write a Java program to check if an input string starts with “T”. If it is
		 * start with “T” print “Yes that is the string”, otherwise print “That is not
		 * the one”.
		 */

		// DataType Variable = Value;

		// String
		// Create Scanner Object

		Scanner input = new Scanner(System.in);

		String checkCharacter = "T";

		// Prompt the user

		System.out.print("Enter the character: ");

		String checkCharacter2 = input.nextLine();

		if (checkCharacter2.startsWith(checkCharacter)) {
			System.out.println("Yes that is the string");
		} else {
			System.out.println("That is not the one");
		}

		input.close();

	}

}
