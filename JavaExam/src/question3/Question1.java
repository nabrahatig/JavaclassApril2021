package question3;

public class Question1 {

	public static void main(String[] args) {
		// Write a program that takes a number and prints n row pyramid accordingly
		// for example if a user inputs 3, it prints the below there'*' in three rows
		

		for (int i = 0; i <=5; i++) {
		for (int j = 0; j <= 5; j++) {
		System.out.print("");
		}
		for (int k = 0; k <i; k++) { 
			System.out.print("*"); 
			} 
		System.out.println();

		}
	}

}
