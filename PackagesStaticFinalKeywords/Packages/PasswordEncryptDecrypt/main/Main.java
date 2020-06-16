package main;

import entities.ExtendedPassword;
import entities.Password;

import java.util.Scanner;

public class Main {

    static Password password = new ExtendedPassword(123456);
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        menu();

    }

    private static boolean menu() {
        password.storePassword();
        System.out.println("Enter password to get in: ");

        while (password.letMeIn(s.nextInt()) == false) {
            //we will continue to loop until this statement becomes true
        }
        return true;
    }
}
