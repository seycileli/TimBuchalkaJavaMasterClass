package main;

import entities.Account;

public class Main {

    static Account seyhanAccount = new Account("Seyhan");
    public static void main(String[] args) {

        seyhanAccount.deposit(1000);
        seyhanAccount.withdraw(500);
        seyhanAccount.withdraw(-200);
        seyhanAccount.deposit(-20);
        seyhanAccount.calculateBalance();

        System.out.println("Hello, " + seyhanAccount.accountName +
                ". Your current balance: $" + seyhanAccount.getBalance());

    }

}
