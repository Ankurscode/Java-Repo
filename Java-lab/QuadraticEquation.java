import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        // Calculate the discriminant
        double D = calculateDiscriminant(a, b);
        System.out.println("Discriminant (D) = " + D);

        // Determine and display the nature of the roots
        determineRoots(a, b, D);

        scanner.close();
    }

    // Method to calculate the discriminant
    public static double calculateDiscriminant(double a, double b) {
        return b * b - 4 * a * 0; // Simplified because c = 0
    }

    // Method to determine the nature of the roots and display them
    public static void determineRoots(double a, double b, double D) {
        if (D > 0) {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("The roots are real and different.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (D == 0) {
            double root = -b / (2 * a);
            System.out.println("The root is real and equal.");
            System.out.println("Root: " + root);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
