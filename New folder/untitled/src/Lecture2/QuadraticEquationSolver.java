package Lecture2;

import java.util.Scanner;

    public class QuadraticEquationSolver {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the coefficients of the quadratic equation
            System.out.println("Enter the coefficients of the quadratic equation ax^2 + bx + c = 0:");
            System.out.print("Enter coefficient a: ");
            double a = scanner.nextDouble();
            System.out.print("Enter coefficient b: ");
            double b = scanner.nextDouble();
            System.out.print("Enter coefficient c: ");
            double c = scanner.nextDouble();

            // Calculate the discriminant
            double discriminant = b * b - 4 * a * c;

            // Calculate and print the roots
            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The roots of the quadratic equation are real and distinct:");
                System.out.println("Root 1: " + root1);
                System.out.println("Root 2: " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("The roots of the quadratic equation are real and equal:");
                System.out.println("Root: " + root);
            } else {
                System.out.println("The roots of the quadratic equation are complex.");
                // Print the real and imaginary parts separately
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
                System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
            }

            scanner.close();
        }
    }
