package entities;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISavable {

    private String name;
    private int health;
    private String attackMoveName;
    private int attackMove;

    public Monster() {
        super(); //empty constructor
    }

    public Monster(String string) {
        super(); //constructor for when we name our new dragons/ monsters
    }

    public Monster(String name, int health, String attackMoveName, int attackMove) {
        this.name = name;
        this.health = health;
        this.attackMoveName = attackMoveName;
        this.attackMove = attackMove;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attackMoveName='" + attackMoveName + '\'' +
                ", attackMove=" + attackMove +
                '}';
    }

    public String attack() {
        String newMonster = "!^_&^$@+%$* I don't know how to attack!";
        return newMonster;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println(name);
        this.name = name;
    }

    public int getHealth() {
        System.out.println(health);
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getAttackMoveName() {
        return attackMoveName;
    }

    public void setAttackMoveName(String attackMoveName) {
        System.out.println(attackMoveName);
        this.attackMoveName = attackMoveName;
    }

    public int getAttackMove() {
        System.out.println(attackMove);
        return attackMove;
    }

    public void setAttackMove(int attackMove) {
        this.attackMove = attackMove;
    }

    //by creating these two methods, we can now save our monsters in the game
    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, "" + this.name);
        values.add(1, "" + this.health);
        values.add(2, "" + this.attackMove);
        values.add(3, "" + this.attackMoveName);

        return values;
    }

    @Override
    public void read(List<String> saveValues) {
        if (saveValues != null && saveValues.size() > 0) {
            this.name = saveValues.get(0);
            this.health = Integer.parseInt(saveValues.get(1));
            this.attackMove = Integer.parseInt(saveValues.get(2));
            this.attackMoveName = saveValues.get(3);
        }
    }
}
