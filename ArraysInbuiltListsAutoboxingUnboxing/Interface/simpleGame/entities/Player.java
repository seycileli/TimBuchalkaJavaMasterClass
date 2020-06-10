package entities;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISavable {

    /* Create instance variables (fields) for Player;
    * give player a name of datatype String
    * give player a health bar, of datatype int
    * give the player an attack/ strength, of datatype int
    * give the player a weapon, of datatype String
    * */

    private String name, weapon;
    private int health, attack;

    public Player() {
        super();
    }

    public Player(String name, int health, int attack) {
        this.name = name;
        this.weapon = "Sword";
        this.health = health;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                '}';
    }

    @Override
    public List<String> write() {
        //this method is to save our character
        List<String> values = new ArrayList<>();
        values.add(0, this.name); //index position of our choice
        values.add(1, "" + this.health);
        values.add(2, this.weapon);
        values.add(3, "" + this.attack);

        return values;
    }

    @Override
    public void read(List<String> saveValues) {
        //this is to save our character in a save slot
        if(saveValues != null && saveValues.size() > 0) {
            this.name = saveValues.get(0);
            this.health = Integer.parseInt(saveValues.get(2));
            this.weapon = saveValues.get(1);
            this.attack = Integer.parseInt(saveValues.get(3));
        }
    }
}
