package day3;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		//Write a program that takes integer input(1 to7)from the a user, 1 representing Monday to 7 representing Sunday.
		//The program should decide whether the day input is a weekend or a weekday.(use switch statement)
		//enter number:1, You entered 1 for Monday, Monday is a weekend
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 1 to 7: ");

		int num = input.nextInt();

		switch (num) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}
		if (num <= 5) {
			System.out.println("Weekday");
		} else {
			System.out.println("Weekend");
		Default: 
			System.out.println("That is not a day");

		}
		input.close();

	}

}
