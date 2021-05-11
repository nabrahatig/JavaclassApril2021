package day3;

import java.io.InputStream;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		/// Use while loop and create a program that calculates the average of then
		/// numbers between x and y
		// and y are the integers the user has to input.Enter x : 2Enter y : 6/*
		// input
		// DataType Variable =Value
		// user input x and y

		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter a Number for X:");
		int x = input.nextInt();
		System.out.println("Please Enter a Number for Y:");
		int y = input.nextInt();

		int avg = (x + y) / 2;
		System.out.println("THe average of x and y is :" + avg);

	}

}
