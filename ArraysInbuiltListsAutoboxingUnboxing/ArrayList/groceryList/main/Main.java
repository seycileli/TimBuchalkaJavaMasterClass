package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static GroceryList groceryList = new GroceryList();
    private static Scanner s = new Scanner(System.in);
    private static boolean quitMenu;
    private static int choice;
    public static void main(String[] args) {

        menu();

    }

    public static void menu() {
        quitMenu = false;
        choice = 0;

        instructions();

        while(!quitMenu) {
            System.out.println("Enter your choice: ");
            choice = s.nextInt();
            s.nextLine();

            switch(choice) {
                case 0:
                    instructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItems();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeAnItem();
                    break;
                case 5:
                    searchGroceryList();
                    break;
                case 6:
                    saveOurList();
                    break;
                case 7:
                    quitMenu = true;
                    break;
            }
        }
    }

    private static void instructions() {
        System.out.println("\n ----- { APP Instructions } ----- \n" +
                "0: Bring up menu options \n" +
                "1: Check current grocery list status \n" +
                "2: Add item(s) to grocery list \n" +
                "3: Edit your grocery list \n" +
                "4: Remove item(s) from your grocery list \n" +
                "5: Search for an item in grocery list \n" +
                "6: Save grocery list \n" +
                "7: Quit Application \n");
    }

    public static void addItems() {
        System.out.print("What item would you like to add to your grocery list? ");
        groceryList.addGroceryItem(s.nextLine());
        System.out.println("Updated.");
    }

    private static void modifyItem() {
        System.out.print("Enter the item name to remove from your grocery list: ");
        String currentItem = s.nextLine();

        System.out.print("Enter replacement item: ");
        String newItem = s.nextLine();
        groceryList.modifyGroceryList(currentItem, newItem);
    }

    public static void removeAnItem() {
        System.out.print("Enter item name: ");
        String currentItem = s.nextLine();
        groceryList.removeGroceryItem(currentItem);
    }

    private static void searchGroceryList() {
        System.out.print("Enter item name to start search: ");
        String searchForItem = s.nextLine();

        if (groceryList.onList(searchForItem)) {
            System.out.println("Found item: " + searchForItem);
        } else {
            System.out.println(searchForItem + " is not on your grocery list.");
        }
    }

    public static void saveOurList() {
//        ArrayList<String> saveGroceryList = new ArrayList<>();
//        saveGroceryList.addAll(groceryList.getGroceryList());

        //short cut to the above method
        ArrayList<String> saveGroceryList = new ArrayList<>(groceryList.getGroceryList());
    }
}
