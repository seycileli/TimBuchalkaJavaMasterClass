package bankApplication;

import java.util.Scanner;

public class Main {

    private static Scanner input;
    private static int userSelection = 0;
    private static Entities myBankAccount = new Entities();
    public static void main(String[] args) {
        input = new Scanner(System.in);

        runMyApp();
        register();

    }

    public static void runMyApp() {
        //creating fields for balance, account number, customer name, email and phone number

        do {
            /*
            Creating our Main Menu options first.
             */
            System.out.println("Welcome to World West Banking." + "\n" +
                    "[1] Register |" + "| [2] Login ");
            input.nextInt();

            if (userSelection == 1) {
                register();
            } else if (userSelection == 2) {
                login();
            } else {
                System.exit(0);
            }

//        } do {

        } while (true); //will change this future
    }

    private static void register() {
        /*
         register == new created account

         Have the user input their information based off of the Fields that we've created.

         Such as;
         Customer name, email, phone number

         Give the user an account number after registering,

         Give the user an option to deposit funds into their new account
         */

        System.out.print("Welcome to World West Banking." + "\n"
        + "Let's begin the registration process by getting to know you." + "\n"
                + "Please enter your name: ");
        myBankAccount.setCustomerName(input.nextLine());
        System.out.print("Please enter your email address: ");
        myBankAccount.setEmail(input.nextLine());
        System.out.print("Please enter your phone number: ");
        myBankAccount.setPhoneNumber(input.nextLine());
        System.out.print("Here is your Account Number: 10001");
        myBankAccount.setAccountNumber("10001");
        System.out.println("\n" + "Nice to meet you. " + myBankAccount.getCustomerName() + "\n" +
        "Would you like to make a deposit?" + "\n"
        + "[Y] || [N]");
        String inputString = input.nextLine();

        if (inputString.equalsIgnoreCase("y")) {
            System.out.print("After placing cash. Please enter the deposited amount: ");
            myBankAccount.depositFunds(input.nextInt());
        } else {
            System.out.println("Welcome again, to World West Banking." + "\n"
                    + "We're happy to have you.");
        }
    }

    private static void login() {
        Entities newAccount = new Entities(29029, "1001",
                "Seyhan Cileli", "seyhan@email.com", "(646) 288-6294");
    }

}
