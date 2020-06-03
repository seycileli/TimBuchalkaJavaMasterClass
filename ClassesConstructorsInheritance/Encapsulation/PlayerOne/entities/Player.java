package entities;

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        //a method to be called for whenever a player takes damage. Their health will decrease
        this.health = this.health - damage;

        if (this.health <= 0) {
            System.out.println("Player knocked out.");
        } //reduce number of remaining lives for the Player
    }

    public int healthRemaining() {
        return this.health;
    }


}
