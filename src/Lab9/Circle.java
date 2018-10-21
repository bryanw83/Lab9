package Lab9;

import java.util.Scanner;

public class Circle {
	private double radius;

	public Circle(double rad) {
		radius = rad;
	}

	public Circle() {

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getCircumference() {
		return 2 * (Math.PI * radius);
	}

	public void getFormattedCircumference() {
		System.out.print("The circumference of the circle is: ");
		System.out.printf("%.2f", getCircumference());
	}

	public double getArea() {
		return Math.PI * (Math.pow(radius, 2));
	}

	public void getFormattedArea() {
		System.out.print("The area of the circle is: ");
		System.out.printf("%.2f", getArea());
	}

	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
			}
			sc.nextLine();
		}
		return d;
	}

	@Override
	public String toString() {
		return toString();
	}

}