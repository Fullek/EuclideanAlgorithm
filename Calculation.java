package demo_package;

import java.util.Scanner;

public class Calculation {

    Scanner scanner = new Scanner(System.in);

    private int getNumber() {
        return scanner.nextInt();
    }

    private int euclideanAlgorithm(int a, int b) {
        int c;
        while (b != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public int inputManager() {
        int a = getNumber();
        int b = getNumber();
        return euclideanAlgorithm(a, b);
    }

    public void programDemo() {
        System.out.println("Euclidean Algorithm, the program will find the biggest divider of two numbers" +
                "\nInput first number, press enter and then input second number: ");

        System.out.println("The biggest divider of these numbers is: " + inputManager());
    }
}
