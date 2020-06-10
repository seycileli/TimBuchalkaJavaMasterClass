package main;

import entities.ISavable;
import entities.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Player player = new Player();
    private static ArrayList<String> values;
    private static Scanner s = new Scanner(System.in);
    private static boolean flag = false;
    public static void main(String[] args) {

        menu();

    }

    public static void menu() {
        int index = 0;
        //enter screen
        System.out.println("\n   Welcome New Player \n" +
                "Start your adventure today \n" +
                "[1] To Enter || [0] To Exit \n");
        int action = s.nextInt();

        while(!flag) {

            switch(action) {
                case 0:
                    flag = true;
                    break;
                case 1:
                    createYourCharacter();
            }
        }
    }

    private static void createYourCharacter() {
        String playerName;

        System.out.println("\nWelcome to the Citadel, I'm Ece. \n" +
                "I'll be your assistant through your adventures. \n" +
                "But before we begin, I think it's only right that I know who I'll assisting. \n" +
                "What should I call you?");
        playerName = s.nextLine();

        if (playerName.equalsIgnoreCase("fuck") || playerName.equalsIgnoreCase("fcuk")
        || playerName.equalsIgnoreCase("bitch") || playerName.equalsIgnoreCase("btich")
        || playerName.equalsIgnoreCase("ass")) {
            flag = false;
        } else {
            player.setName(playerName);
            System.out.println("Nice to meet you " + player.getName() +
                    "\n Before you get out there and fight. Let me give you your weapon. \n" +
                    player.getName() + " has acquired " + player.getWeapon());
            values.add(playerName);
            flag = true;
        }
    }

    public static void saveObject(ISavable objectToSave) {
        for(int i=0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISavable objectToLoad) {
        objectToLoad.read(values);
    }
}
