package question2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// Write a program that accepts mark of a student and prints the grade
		// >90 =A,>80=B,>70=c,>50=F
try {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		// Tell user

		int num = input.nextInt();

		if (num >= 90) {
			System.out.println("Grade = A");
			
		} else if (num >= 80) {
			System.out.println("Grade = B");
			
		} else if (num >= 70) {
			System.out.println("Grade = C");
			
		} else if (num >= 50) {
			System.out.println("Grade = D");
			
		} else {
			System.out.println("Grade = F");
		}

		input.close();
		
	}  catch(InputMismatchException e) {
		System.out.println("You entered invalid value");	
	}
	}
}
