package Lab9;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Circle circle = new Circle();
		int circleCount = 0;
		String userChoice = null;

		System.out.println("Welcome to the 'Super Scientific Circle Calculator'!\n");
		do {

			double userIn = Circle.getDouble(scnr, "Please enter the radius of a circle: ");
			circleCount = circleCount + 1;
			System.out.println();
			circle.setRadius(userIn);

			circle.getCircumference();
			circle.getFormattedCircumference();
			System.out.println();
			System.out.println();
			circle.getArea();
			circle.getFormattedArea();
			System.out.println();
			System.out.println();

			System.out.println("Would you like to continue?: \n");
			userChoice = scnr.next();

		} while (userChoice.equalsIgnoreCase("y"));

		System.out.println("You created " + circleCount + " circles!\n");
		System.out.println("Thank you for using the 'Super Scientific Circle Calculator'! Goodbye!");
	}

}
