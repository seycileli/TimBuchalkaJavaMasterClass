package entities;

public class HealthyBurger extends Hamburger {

    private String healthyBurgerAddition;
    private double healthyBurgerAdditionPrice;

    private String healthyBurgerAddition1;
    private double healthyBurgerAdditionPrice1;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, price, "Brown Rye");
    }

    //For a healthy burger, you only have the option to add 2 more additional items
    //create methods for those 2, just as you did before
    public void addHealthAdditional(String name, double price) {
        this.healthyBurgerAddition = name;
        this.healthyBurgerAdditionPrice = price;
    }

    public void addHealthAdditional2(String name, double price) {
        this.healthyBurgerAddition1 = name;
        this.healthyBurgerAdditionPrice1 = price;
    }

    /*
    Because HealthyBurger class extends from Hamburger class, this is the beauty of Inheritance

    There is no need to create an additional method,
    similar to itemizedHamburger() for this class, because HealthyBurger being extended to Hamburger
    Can call that method directly once we create an instance of HealthyBurger class

    for example;
    HealthyBurger healthyBurger = new HealthyBurger("burger", meat type here, price, "bun");
    healthyBurger.itemizedHamburger(); <- called due to
    HealthyBurger class being extended to Hamburger class

    Appreciate this beauty, lol.

    But, we do need a method, to tally up the price for healthyBurger toppings,
    Which we can do by creating an @Override method of itemizedBurger
     */

    @Override
    public double itemizedHamburger() {
        double hamburgerPrice = super.itemizedHamburger();

        if (healthyBurgerAddition != null) {
            hamburgerPrice += this.healthyBurgerAdditionPrice;
            System.out.println("Added " + this.healthyBurgerAddition +
                    " for an extra of $" + this.healthyBurgerAdditionPrice);
        }

        if (healthyBurgerAddition1 != null) {
            hamburgerPrice += this.healthyBurgerAdditionPrice1;
            System.out.println("Added " + this.healthyBurgerAddition1 +
                    " for an extra of $" + this.healthyBurgerAdditionPrice1);
        }

        return hamburgerPrice;
    }
}
