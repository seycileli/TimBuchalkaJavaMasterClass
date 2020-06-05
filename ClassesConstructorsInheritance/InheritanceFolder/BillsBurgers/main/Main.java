package main;

import entities.DeluxeBurger;
import entities.Hamburger;
import entities.HealthyBurger;

public class Main {
    private static Hamburger hamburger =
            new Hamburger("basic", "meat", 5.50, "plain");
    private static double price = hamburger.itemizedHamburger();
    private static HealthyBurger healthyBurger =
            new HealthyBurger("Veggie", 7.25);

    public static void main(String[] args) {

        basicHamburger();
        veggieBurger();
        deluxeBurger();

    }

    public static void basicHamburger() {
        System.out.println("\n");
        hamburger.addHamburgerAddition1("tomato's", .25);
        hamburger.addHamburgerAddition2("lettuce", .10);
        hamburger.addHamburgerAddition3("cheese", 1.00);
        hamburger.addHamburgerAddition4("pickles", .25);
        System.out.println("Total burger price is $" + hamburger.itemizedHamburger());
    }

    public static void veggieBurger() {
        System.out.println("\n");
        healthyBurger.addHealthAdditional("egg", 1.50);
        healthyBurger.addHealthAdditional2("onions", .75);
        System.out.println("Total cost $" + healthyBurger.itemizedHamburger());
    }

    public static void deluxeBurger() {
        DeluxeBurger deluxeBurger = new DeluxeBurger();
    }

}
