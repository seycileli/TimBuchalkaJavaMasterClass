package arrayList;

import java.util.ArrayList;

public class GroceryList {
    private static ArrayList<String> groceryList = new ArrayList<>();

    public static void printGroceryList() {
        //this is how we add items to our grocery list
        System.out.print("You have " + groceryList.size() + " items in your grocery list. \n");

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.print((i + 1) + ": " + groceryList.get(i) + "\n");
        }
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void modifyGroceryList(String currentItem, String newItem) {
        /*
        Checking to see if current item exist, if so
        we will pass new item, and replace the currentItem, which then becomes old
         */
        int position = findItems(currentItem);

        if (position >= 0) {
            modifyGroceryList(position, newItem);
        }
    }

    private void modifyGroceryList(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been edited.");
    }

    public void removeGroceryItem(String item) {
        int position = findItems(item);

        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    public boolean onList(String search) {
        int position = findItems(search);

        if (position >= 0) {
            return true;
        }
        return false;
    }

    private int findItems(String search) {
        return groceryList.indexOf(search);
    }

//    public String findItems(String search) {
//        //true or false
////        boolean exist = groceryList.contains(search);
//        int position = groceryList.indexOf(search);
//
//        if (position >= 0) {
//            return groceryList.get(position);
//        }
//        //else
//        return null;
//    }


    public static ArrayList<String> getGroceryList() {
        return groceryList;
    }
}
