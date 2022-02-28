import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n It's calc app.");
        System.out.print("Type first num: ");
        double a = scanner.nextDouble();
        System.out.print("Type second num: ");
        double b = scanner.nextDouble();
        System.out.print("Type command(1 - sum, 2 - diff, 3 - mult): ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Sum: " + a + " + " + b + " = " + sum(a, b));
        } else if (choice == 2) {
            System.out.println("Diff: " + a + " - " + b + " = " + diff(a, b));
        } else if (choice == 3) {
            System.out.println("Mult: " + a + " * " + b + " = " + mult(a, b));
        } else {
            System.out.println("Ooops... Something was wrong!");
            System.out.println("Ooops... Something was wrong!");
        }
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double diff(double a, double b) {
        return a - b;
    }

    public static double mult(double a, double b) {
        return a * b;
    }
}
