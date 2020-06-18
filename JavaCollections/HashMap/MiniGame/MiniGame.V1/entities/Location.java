package entities;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationId;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationId, String description) {
        this.locationId = locationId;
        this.description = description;
        this.exits = new HashMap<>();
        this.exits.put("Q", 0); //function for user to quit out of game
    }

    /* Add methods;
    * The ability to locate exit */
    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }

    public int getLocationId() {
        return locationId;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        /*
        * Nothing outside of this class can change exits
        * for example, so the getter method returns a copy of the exits
        * so if the calling program wants to add or remove mappings from it
        * and the exit mapping field won't be affected
         */
        return new HashMap<>(exits);
    }
}
