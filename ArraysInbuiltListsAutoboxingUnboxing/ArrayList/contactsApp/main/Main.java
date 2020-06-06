package arrayList;

import java.util.Scanner;
import entities.Contacts;
import entities.MobilePhone;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static MobilePhone myPhone = new MobilePhone("646-228-6294");
    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\n Enter action: (Hit 6 to show available actions)");
            int action = s.nextInt();
            s.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Turning off...");
                    quit = true;
                    break;
                case 1:
                    myPhone.printContacts(); //will retrieve contacts from ArrayList
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addNewContact() {
        /*This method is to add a new contact to the directory
        * So therefore, we will ask the user to enter:
        * The contacts name
        * The contacts number
        * Create a variable name, phoneNumber, so that you can retrieve the users input via scanner class
        * After doing so;
        * Call the instance class Contacts, initialize the object, using the new keyword
        * store the contacts object, into the myPhone method by using the
        * addNewContact method from the MobilePhone class
        * Check to see if contact exist with conditional statement;
        * if contact does not exist, print message
        * else; print message this contact already exists
        * */

        System.out.print("Enter new contact name: ");
        String name = s.nextLine();
        System.out.println("Enter new contact phone number: ");
        String phoneNumber = s.nextLine();

        Contacts newContact = Contacts.createContact(name, phoneNumber);
        if (myPhone.addNewContact(newContact)) {
            System.out.println("New contact " + name + ", " + phoneNumber
            + " has been added successfully.");
        } else {
            System.out.println("Can not add contact " + name + ", " + phoneNumber +
                    " because user already exist.");
        }
    }

    private static void updateContact() {
        /* This method, will be used to update a contacts information
        * In doing so, first we must know who the contact is,
        * so therefore; print a message and ask the user who they'll like to update
        * retrieve this message, via the scanner class
        * Next; create an Object of the class Contacts,
        * assign the myPhone variable, and use the queryContact method,
        * use the name that you've retrieved from the user input, in the search field
        * -> the queryContact() method <-
        * NEXT; check if this contact exists by creating a conditional statement
        * IF the user does not exist, return null;
        * next, ask the to enter their new name and number;
        * Create an object of Contacts again, give it the variable name newContact
        * or updatedContact; for example
        * assign it to Contacts, call the method from Contacts class createContact();
        * input both new number and phone number inside of the parameters of createContact();
        * create an If/ else conditional statement;
        * and use the updateContact(); method from MobilePhone class
        * for example;
        * myPhone.updateContact(existingContact, newContact);
        * the above method removes the old info, and replaces it with the new
        * then you can print a message if you like;
        * print("Contact info has been updated successfully");
        * else "error"
        *  */
        System.out.print("Enter contact name you'd like to update: ");
        String name = s.nextLine();
        Contacts existingContact = myPhone.queryContact(name);

        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.print("Enter new contact name: ");
        String newName = s.nextLine();
        System.out.print("Enter new phone number: ");
        String newPhone = s.nextLine();
        Contacts newContact = Contacts.createContact(newName, newPhone);
        if (myPhone.updateContact(existingContact, newContact)) {
            System.out.println("Successfully updated.");
        } else {
            System.out.println("Error while updating contact.");
        }
    }

    private static void deleteContact() {
        /*This is the remove/ delete contact info from directory method
        * We can use the same first few code form updateContact method
        * After the conditional statement;
        * call the myPhone object, use the removeContact(); method from
        * MobilePhone class,
        * input existingContact inside of param
        * */
        System.out.print("Enter contact name you'd like to update: ");
        String name = s.nextLine();
        Contacts existingContact = myPhone.queryContact(name);

        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        if (myPhone.removeContact(existingContact)) {
            System.out.println("Successfully deleted.");
        } else {
            System.out.println("Error while attempting to delete.");
        }
    }

    private static void searchContact() {
        System.out.print("Enter contact name you'd like to update: ");
        String name = s.nextLine();
        Contacts existingContact = myPhone.queryContact(name);

        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: " + existingContact.getName() + "\n" +
                "Phone: " + existingContact.getPhoneNumber());
    }

    public static void startPhone() {
        System.out.println("Starting phone...");
    }

    public static void printActions() {
        System.out.print("\n Available actions \n Press: \n" +
                "0 - Turnoff phone \n" +
                "1 - Check contact(s) \n" +
                "2 - Add a new contact \n" +
                "3 - Update a contact \n" +
                "4 - Delete a contact \n" +
                "5 - Search for a contact \n" +
                "6 - Check available actions \n" +
                "Choose your action: ");
    }
}
