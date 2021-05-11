package Day5;

public class Main {

	public static void main(String[] args) {
		//Write a java program that has a Polygon class with a property Sides and color. In the main class create 3 objects triangle,
		//rectangle and polygon

		Polygon triangle = new Polygon(8, "Yellow");
		triangle.printSides();
		triangle.printColor();
		Polygon rectangle = new Polygon(6, "Blue");
		rectangle.printSides();
		rectangle.printColor();
		Polygon polygon = new Polygon(4, "Grey");
		polygon.printSides();
		polygon.printColor();

		System.out.println();

		ThreeDimentionalShape printHeight = new ThreeDimentionalShape(3, "Red", 15);

		printHeight.printSides();
		printHeight.printColor();
		printHeight.diasplayHeight();
	}

}
