package day1;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// output sample

		// radius = 7.5
		// Parameter is = 47.12388980384689
		// area is = 176.71458676442586

		// double parameter =2* math .pi * radius;
		// double area = Math.PI * radius;
		// System.out.printline("Parameter is = " + parameter)
		// system.out.println("area is = " + area);

		// Write a Java program to print the area and parameter of a circle

		double radius = 7.5;

		double area = Math.PI * radius * radius;
		double perimeter = 2 * Math.PI * radius;

		
		System.out.println("Perimeter is = " + perimeter);
		System.out.println("Area is = " + area);

	}

}
