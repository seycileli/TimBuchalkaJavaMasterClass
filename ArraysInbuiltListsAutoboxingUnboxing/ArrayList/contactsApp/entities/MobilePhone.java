package arrayList;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contacts contacts) {
        if (findContact(contacts) >= 0) {
            //if user exist, do not save and return back this message below
            System.out.println("This user " + contacts + " exist.");
            return false;
        }
        //else, if contact does not exist, save contact
        this.myContacts.add(contacts);
        return true;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            //if contact is not found, which most likely mean does not exist in our contact application
            System.out.println(oldContact.getName() + ", not found.");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("Contact " + newContact.getName() +
                    " already exists. Update failed.");
            return false;
        }

        //if contact has not been found, contact info will be updated with new info
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " has been updated with \n" +
                newContact.getName());
        return true;
    }

    public boolean removeContact(Contacts contacts) {
        int foundPosition = findContact(contacts);
        if (foundPosition < 0) {
            //if contact does not exist
            System.out.println("This contact doesn't exist in your directory.");
            return false;
        }
        this.myContacts.remove(contacts);
        System.out.println(contacts.getName() + " successfully deleted.");
        return true;
    }

    //this method will be used to check if contact exist or not when saving new contact
    private int findContact(Contacts contacts) {
        return this.myContacts.indexOf(contacts);
    }

    //this method is for user to search through their contacts
    private int findContact(String contactName) {

        for (int i = 0; i < this.myContacts.size(); i ++) {
            Contacts contacts = this.myContacts.get(i);
            if (contacts.getName().equals(contactName)) {
                return i;
            }
        }
        return -1; //not found
    }

    public String queryContact(Contacts contacts) {
        if (findContact(contacts) >= 0) {
            //if Contacts indexOf >= 0, means it is on file, and we will return back contact infomation
            return contacts.getName();
        }
        //if >= 0, means contact information is not on file
        return null;
    }

    public Contacts queryContact(String name) {
        /*This method is used to search for any contact
        * That has the name, that the user has input to search for
        * via using the scanner class
        * IF; the uer exist, we will return back the user info (number, phone)
        * ELSE, if the user does not exist, we will return back null
        * */
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        /*
        * An ArrayList is already a class itself, so therefore you can use it's "get" function
        * to retrieve the field that you're looking for.
        * This method will print out all contacts that are stored within
        * the Arraylist myContacts, which has the object Contacts class
        * inside of the brackets
        * ArrayList<ContactsClassHere> myContacts <- is our instance field, which we use
        * to access our stored information
        * */

        System.out.println("\n My Contacts: \n");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + ": " +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }
}
