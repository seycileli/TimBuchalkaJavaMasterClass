package main;

import entities.Location;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Scanner s = new Scanner(System.in);
    private static Map<Integer, Location> locations = new HashMap<>();
    public static void main(String[] args) {

        System.out.println("\n STARTING UP GAME \n ... \n");

        /*
        * Create a temporary Map and set up with the correct exits
        * So that we can pass them inside of the param
        * of Location constructor */
        Map<String, Integer> tempExit = new HashMap<>();
        locations.put(0, new Location(0, "you're home", null));
        tempExit.put("W", 2);


        tempExit = new HashMap<>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        tempExit.put("Q", 0);
        locations.put(1, new Location(1, "you're on the road to adventure",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 5);
        tempExit.put("Q", 0);
        locations.put(2, new Location(2, "you've entered a forest", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W", 1);
        tempExit.put("Q", 0);
        locations.put(3, new Location(3, "you've ended up in a cave", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        tempExit.put("Q", 0);
        locations.put(4, new Location(4, "you're on the top of a hill", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        tempExit.put("Q", 0);
        locations.put(5, new Location(5, "you're downtown", tempExit));

        HashMap<String, String> vocab = new HashMap<>();
        vocab.put("QUIT", "Q");
        vocab.put("NORTH", "N");
        vocab.put("SOUTH", "S");
        vocab.put("WEST", "W");
        vocab.put("EAST", "E");


        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            /*
            * Retrieving the exit that are valid for the particular location
            * we are inputting via scanner class */
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
                tempExit.remove("S"); //remove the South location/ direction from game
            }
            System.out.println();

            /*
            * If input is greater than 1, that means it isn't a single character command and therefore
            * we will continue on, but if it is greater like it is in this case
            * we will split the contents of the input with a space
            * so that we can get it into our words string array and we're going to through
            * those words to see if a particular word is stored
            * inside of our HashMap, vocab (vocabulary)
            * and then we will set our direction based on that input
            * so if "run south" or "please go west" was typed in for example
            * we're ignoring the other words than the word that is existing
            * in our vocab Map */
            String direction = s.nextLine().toUpperCase();
            if (direction.length() > 1) {
                String [] words = direction.split(" ");
                for (String word : words) {
                    if (vocab.containsKey(word)) {
                        direction = vocab.get(word);
                        break;
                    }
                }
            }

            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You can not go in that direction");
            }

        }
    }

}
