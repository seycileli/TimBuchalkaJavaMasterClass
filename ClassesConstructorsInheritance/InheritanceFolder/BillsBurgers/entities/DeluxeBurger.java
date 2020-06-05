package entities;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "Beef", 11.75, "Sesame Seed");
        super.addHamburgerAddition1("Fries", 3.25);
        super.addHamburgerAddition2("Drink", 2.00);
        itemizedHamburger();
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Can not add additional items to a Deluxe Hamburger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Can not add additional items to a Deluxe Hamburger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Can not add additional items to a Deluxe Hamburger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Can not add additional items to a Deluxe Hamburger");
    }
}
