package calculator;

import java.util.Scanner;

public class Main {

    private static Scanner sc;
    static int userSelection = 0;
    private static SimpleCalculator calculator = new SimpleCalculator();
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        calculatorMainApp();

    }

    public static void calculatorMainApp() {

        do {
            System.out.println("\n" + "=== SIMPLE CALCULATOR ===");
            System.out.println("\n" + "[(1) ADD ] " +
                    " [(2) SUBTRACT ]" +
                    " [(3) MULTIPLY ]" +
                    " [(4) DIVIDE ]" +
                    " [(5) EXIT PROGRAM ]");
            do {
                System.out.println("[ SELECT OPTIONS 1 - 5 ] ");
                userSelection = sc.nextInt();
                System.out.println(userSelection < 1 || userSelection > 5 ? " INVALID ENTRY" : " ");

            } while (userSelection < 1 || userSelection > 5);
            {
                switch (userSelection) {
                    case 1:
                        System.out.println(" [ ADDITION ] ");
                        addition();
                        break;
                    case 2:
                        System.out.println("\n [ SUBTRACT ] ");
                        subtraction();
                        break;
                    case 3:
                        System.out.println("\n [ MULTIPLY ] ");
                        multiplication();
                        break;
                    case 4:
                        System.out.println("\n [ DIVIDE ] ");
                        division();
                        break;
                    case 5:
                        System.out.println("\n [ EXIT ] ");
                        exit();
                        break;
                    default:
                        System.out.println("\n [ INVALID ENTRY ] ");
                }
            }
        } while (userSelection != 5);
    }

    private static void addition() {
        calculator.setFirstNumber(sc.nextDouble());
        System.out.print(calculator.getFirstNumber() + " + ");
        calculator.setSecondNumber(sc.nextDouble());
        System.out.print(calculator.getFirstNumber() + " + "
                + calculator.getSecondNumber() + " = " + calculator.getAdditionResult()
        + "\n");
    }

    private static void subtraction() {
        calculator.setFirstNumber(sc.nextDouble());
        System.out.print(calculator.getFirstNumber() + " - ");

        calculator.setSecondNumber(sc.nextDouble());
        System.out.println(calculator.getFirstNumber() + " - "
                + calculator.getSecondNumber() + " = " +
                calculator.getSubtractionResult() + "\n");
    }

    private static void multiplication() {
        calculator.setFirstNumber(sc.nextDouble());
        System.out.print(calculator.getFirstNumber() + " * ");
        calculator.setSecondNumber(sc.nextDouble());
        System.out.println(calculator.getFirstNumber() + " * "
                + calculator.getSecondNumber() + " = " +
                calculator.getMultiplicationResult() + "\n");
    }

    private static void division() {
        calculator.setFirstNumber(sc.nextDouble());
        System.out.print(calculator.getFirstNumber() + " / ");
        calculator.setSecondNumber(sc.nextDouble());
        System.out.println(calculator.getFirstNumber() + " / "
                + calculator.getSecondNumber() + " = " +
                calculator.getDivisionResult() + "\n");
    }

    private static void exit() {
        System.exit(0);
    }
}
