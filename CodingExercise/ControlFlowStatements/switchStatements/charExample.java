package controlFlowStatements;

import java.util.Scanner;

public class SwitchTest {

    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        testing();
        testingScanner();
    }

    /**
     * Create a Switch statement using Char primitive datatype
     * Create a new Char variable
     * Create a switch statement for testing
     * A, B, C, D, or E
     * ~ ~ ~ display a message if any of these types are found and then break
     * Add a default which displays a message not found
     */
    public static void testing() {
        char charVar = 'a';

        switch (charVar) {
            case 'a':
            case 'A':
                System.out.println("Value is A");
                break;
            case 'b':
            case 'B':
                System.out.println("Value is B");
                break;
            case 'c':
            case 'C':
                System.out.println("Value is C");
                break;
            case 'd':
            case 'D':
                System.out.println("Value is D");
                break;
            case 'e':
            case 'E':
                System.out.println("Value is E");
                break;
            default:
                System.out.println("Not found");
                break;
        }

    }

    //testing with Scanner class
    public static void testingScanner() {
        System.out.print("Enter a single character: ");

        char variableName = sc.next().charAt(0);
        
//      extracting first character on String example 0; 
//      OR
//      char variableName = sc.next().trim().charAt(0);
//      just to be safe with whitespace, we can call trim() method to remove any whitespace

        switch (variableName) {
            case 'a': case 'A':
                System.out.println("Value was A");
                break;
            case 'b':
            case 'B':
                System.out.println("Value is B");
                break;
            case 'c':
            case 'C':
                System.out.println("Value is C");
                break;
            case 'd':
            case 'D':
                System.out.println("Value is D");
                break;
            case 'e':
            case 'E':
                System.out.println("Value is E");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
