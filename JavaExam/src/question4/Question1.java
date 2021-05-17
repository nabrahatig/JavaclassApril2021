package question4;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		String str = "Java Programming";
		int vowels = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char check = str.charAt(i);
			
			if(check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u') {
				vowels++;
			}
			
		}
		System.out.println("Vowels: " + vowels);

	}

}
