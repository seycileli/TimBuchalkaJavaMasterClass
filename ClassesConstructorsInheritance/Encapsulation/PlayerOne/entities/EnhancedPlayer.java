package entities;

public class EnhancedPlayer {
    /*
    Creating an Encapsulation Class,
    Our fields are private, making sure that our class (or fields within out class) are not accessible
     */

    private String name;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        //a method to be called for whenever a player takes damage. Their health will decrease
        this.health = this.health - damage;

        if (this.health <= 0) {
            System.out.println("Player has knocked out!");
        } //reduce number of remaining lives for the Player
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHealth() {
        return health;
    }
}
