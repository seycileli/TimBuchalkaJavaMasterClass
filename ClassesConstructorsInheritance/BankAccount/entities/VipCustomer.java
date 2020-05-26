package bankApplication;

public class VipCustomer {

    /*
    Create a Class named VipCustomer
    It should have 3 fields;
                        name
                        creditLimit
                        emailAddress

     The first constructor; should be empty, and should call the constructor with 3 params
     The second constructor; should pass on the 2 values it receives and add a default value for the 3rd
     The third constructor; should have all fields

     Create Getters only for this using generation of IntelliJ as setters won't be needed
     */

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default name", 1_000_000.00, "default@email.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "default@email.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
