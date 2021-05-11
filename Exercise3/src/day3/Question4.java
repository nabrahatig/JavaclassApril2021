package day3;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// Write a program that takes a positive integer input and
		// prints all the positive even number less than the number
		// in order from big to small.(Use do while loop)

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of x:");
		int x = input.nextInt();

		do

		{
			x--;
			if (x % 2 == 0) {
				System.out.println(x);
			}

		} while (x > 0);

		input.close();
	}

}
