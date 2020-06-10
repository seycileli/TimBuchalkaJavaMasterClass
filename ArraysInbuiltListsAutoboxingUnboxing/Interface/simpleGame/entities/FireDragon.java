package entities;

public class FireDragon extends Monster {

    public FireDragon() {
        super();
    }

    public FireDragon(String string) {
        super(string);
    }

    public String name() {
        return "Fire Dragon";
    }

    public int healthBar() {
        System.out.println(getName() + " has " + getHealth() + "hp");
        setHealth(100);
        return healthBar();
    }

    public String basicAttack() {
        setAttackMoveName("Basic Attack");
        setAttackMove(15); //20 damage
        String basicAttack = "Attack with swipe";

        return name() + " has used " + getAttackMoveName() + " for "
                + getAttackMove() + " damage.";
    }

    public String airAttack() {
        setAttackMoveName("Air attack");
        setAttackMove(15);
        String airAttack = "Flying attack";

        System.out.println("Fire Dragon has used " + getAttackMoveName() + " for "
                + getAttackMove() + " damage.");

        return airAttack;
    }

    public String specialAttack() {
        setAttackMoveName("Special attack");
        setAttackMove(40);
        String specialAttack = "Breathes fire";
        System.out.println("Fire Dragon has used " + getAttackMoveName() + " for "
                + getAttackMove() + " damage.");
        return specialAttack;
    }
}
