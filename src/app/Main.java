package app;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("My git app.Super!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double firstNum = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double secondNum = scanner.nextDouble();
        System.out.println(add(firstNum, secondNum));
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
