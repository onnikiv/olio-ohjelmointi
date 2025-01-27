package task01;

import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nax^2 + bx + c = 0");
        System.out.println("Enter coefficient (A):");
        double a = scanner.nextDouble();

        System.out.println("Enter coefficient (B): ");
        double b = scanner.nextDouble();

        System.out.println("Enter coefficient (C): ");
        double c = scanner.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double x1 = ((-b + Math.sqrt(discriminant)) / (2 * a));
        double x2 = ((-b - Math.sqrt(discriminant)) / (2 * a));

        System.out.println("\nEquation: " + a + "x^2 + " + b + "x + " + c + " = 0");
        
        if (a == 0) {
            System.out.println("No solution, (A cannot be 0!\n");

        } else if (discriminant == 0) {
            System.out.println("Discriminant: " + discriminant);
            System.out.println("Only one root");
            System.out.println("Root: " + x1 + "\n");

        } else if (discriminant > 0) {
            System.out.println("Discriminant: " + discriminant);
            System.out.println("Roots: ");
            System.out.println("x_1: "+ x1);
            System.out.println("x_2: "+ x2+ "\n");

        } else {System.out.println("No real roots!\n");}

        scanner.close();
    }
}
