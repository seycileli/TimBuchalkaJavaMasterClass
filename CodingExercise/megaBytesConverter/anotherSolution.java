package codingExercise;

import java.util.Scanner;

public class MegaBytesConverter {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        MegaBytesAndKiloBytesConverter();
        byteConverter();

    }

    /**
     * The solutions below I did for fun.
     * This time we're using the Scanner class.
     */
    public static void MegaBytesAndKiloBytesConverter() {
        int kiloBytes = sc.nextInt();

        System.out.println(kiloBytes + " KB = " + kiloBytes / 1024
                + " MB and " + kiloBytes % 1024 + " KB");

    }

    public static void byteConverter() {

        int byteChecker = sc.nextInt();
        int megaBytes = byteChecker / 1024;
        int kiloBytes = byteChecker % 1024;

        System.out.println(byteChecker + " KB = " + megaBytes
                + " MB and " + kiloBytes + " KB");
    }
}
