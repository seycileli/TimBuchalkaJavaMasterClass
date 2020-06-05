package entities;

public class Hamburger {

    /*
    Create instance variables (fields) for the most basic hamburger
     */

    private String name;
    private String meat;
    private double price;
    private String bunType;

    /*
    Create a tracker for additional items

    create 4 additional fields to track an items name along with it's price
     */

    private String additionalItemName1;
    private double additionalItemPrice1;

    private String additionalItemName2;
    private double additionalItemPrice2;

    private String additionalItemName3;
    private double additionalItemPrice3;

    private String additionalItemName4;
    private double additionalItemPrice4;

    //our most basic constructor
    public Hamburger(String name, String meat, double price, String bunType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.bunType = bunType;
    }

    /*
    Create a mechanism that adds our additional items,
    Enable the calling process to send the name and price of the item
    and for us to record it
     */

    public void addHamburgerAddition1(String name, double price) {
        this.additionalItemName1 = name;
        this.additionalItemPrice1 = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.additionalItemName2 = name;
        this.additionalItemPrice2 = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.additionalItemName3 = name;
        this.additionalItemPrice3 = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.additionalItemName4 = name;
        this.additionalItemPrice4 = price;
    }

    /*
    Create a method that enables us to go through our menu
    and adds up the price of the hamburger
    start off with the base price
    then go through and check whether we've actually received
    an additional item
     */
    public double itemizedHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " " + this.meat + " hamburger on a " +
                this.bunType + " bun priced at $" + this.price);

        if (this.additionalItemName1 != null) {
            hamburgerPrice += this.additionalItemPrice1; //adding the price to this burger

            System.out.println("Added " + this.additionalItemName1 + " for an extra $"
                    + this.additionalItemPrice1);

        }

        if (this.additionalItemName2 != null) {
            hamburgerPrice += this.additionalItemPrice2; //adding the price to this burger

            System.out.println("Added " + this.additionalItemName2 + " for an extra $"
                    + this.additionalItemPrice2);

        }

        if (this.additionalItemName3 != null) {
            hamburgerPrice += this.additionalItemPrice3; //adding the price to this burger

            System.out.println("Added " + this.additionalItemName3 + " for an extra $"
                    + this.additionalItemPrice3);

        }

        if (this.additionalItemName4 != null) {
            hamburgerPrice += this.additionalItemPrice4; //adding the price to this burger

            System.out.println("Added " + this.additionalItemName4 + " for an extra $"
                    + this.additionalItemPrice4);
        }

        return hamburgerPrice;
    }
}
