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

        locations.put(0, new Location(0, "you're home"));
        locations.put(1, new Location(1, "you're on the road to adventure"));
        locations.put(2, new Location(2, "you've entered a forest"));
        locations.put(3, new Location(3, "you've ended up in a cave"));
        locations.put(4, new Location(4, "you're on the top of a hill"));
        locations.put(5, new Location(5, "you're downtown"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);
        locations.get(1).addExit("Q", 0);

        locations.get(2).addExit("N", 5);
        locations.get(2).addExit("Q", 0);

        locations.get(3).addExit("W", 1);
        locations.get(3).addExit("Q", 0);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);
        locations.get(4).addExit("Q", 0);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
        locations.get(5).addExit("Q", 0);

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
