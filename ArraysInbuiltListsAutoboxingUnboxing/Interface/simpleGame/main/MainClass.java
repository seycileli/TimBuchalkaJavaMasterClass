package main;

import entities.ISavable;
import entities.Monster;
import entities.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

/*        readValues(); how you create a new character and save to system */
        player();
        werewolfMonster();

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();
        boolean quit = false;
        int index = 0;

        System.out.println(" Choose \n" +
                "[1] To enter a String" +
                "[0] To quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    //this will be how user can create a new player
                    System.out.print("Enter player name/ weapon, health/ attack dmg: ");
                    String userInput = s.nextLine();
                    values.add(index, userInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISavable objectToSave) {
        /* Passing objectToSave as a parameter to the ISavable interface
        * By doing this, we can use any Object that is using this interface
        * By using the write(); method, we are cycling through all of the entries
        * If you go back and visit the write(); method, inside of the Player class
        * you can see from memory that write() is creating an ArrayList<>
        * One entry in the ArrayList<> for each item, for example
        * player name, weapon, health and attack
        * Because it's using write(), which returns back the entire list
        * figuring out what the size is, via size(); then going through each item
        * and what it should say is saving, and then it should show us the actual object
        * name into storage device */
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i)
            + " to storage device.");
        }
    }

    public static void player() {
        Player playerAxel = new Player();
        playerAxel.setName("Axel");
        playerAxel.setWeapon("Sworded Guitar");
        playerAxel.setHealth(100);
        playerAxel.setAttack(20);
        saveObject(playerAxel);
        loadObject(playerAxel);
        System.out.println(playerAxel);
    }

    public static void loadObject(ISavable objectToLoad) {
        /* The load object, will do the opposite compared to the above save object
        * this method will load the data
        * by creating an ArrayList<> we will assign the method readValues();
        * */
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

    public static void werewolfMonster() {
        ISavable werewolf = new Monster("Werewolf", 100,
                "Claw", 20);
        saveObject(werewolf);
        loadObject(werewolf);
        System.out.println(werewolf);
        System.out.println("attack move " + ((Monster) werewolf).getAttackMove() + "dmg");
        //to retrieve a new objects moves, you'll have to cast it to the Monster class/ object
    }
}
