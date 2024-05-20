package Lecture2;

import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input lengths of all three sides of the triangle
        System.out.println("Enter the lengths of the three sides of the triangle:");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        // Calculate the semi-perimeter
        double s = (side1 + side2 + side3) / 2;

        // Calculate the area using Heron's formula
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        // Print the area
        System.out.println("The area of the triangle is: " + area);

        scanner.close();
    }
}
