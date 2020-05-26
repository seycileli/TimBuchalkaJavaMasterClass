package bankApplication;

public class Entities {
    /*
    Creating fields for balance, account number, customer name, email and phone number

    Typically this Class Name would be "Account" that will be located inside of the entities package
    For this exercise, I will name this class Entities, and keep it all under one package (bankApplication)
     */

    private double balance;
    private String
            accountNumber,
            customerName,
            email,
            phoneNumber;

    public Entities() {
        super();
    }

    public Entities(double balance, String accountNumber, String customerName, String email, String phoneNumber) {
        //Setting Field values in the Constructor

        this.balance = balance;
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit) {
        this.balance += deposit;
        System.out.println("Deposit of $" + deposit + " successful." + "\n" +
                " New balance is: $" + this.balance);
    }

    public void withdrawFunds(double withdraw) {
        if (this.balance - withdraw < 0) {
            System.out.println("Insufficient funds." + "\n" +
                    "Only " + this.balance + " available.");
        } else {
            this.balance -= withdraw;
            System.out.println("Withdrawal of " + withdraw + " processed. " +
                    "Your remaining balance: " + this.balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
