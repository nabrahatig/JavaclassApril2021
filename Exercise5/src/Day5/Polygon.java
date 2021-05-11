package Day5;

public class Polygon {

	int sides = 0;
	String color = "Yellow";

	public Polygon(int sides, String color) {

		this.sides = sides;
		this.color = color;
	}

	public void printSides() {
		System.out.println(sides);

	}

	public void printColor() {
		System.out.println(color);
	}

}
