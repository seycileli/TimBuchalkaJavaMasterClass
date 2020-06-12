package main;

import entities.MyLinkedList;
import entities.Node;
import entities.SearchTree;

public class Main {

    public static void main(String[] args) {

        searchTreeMethod();
//        System.out.println("================");
//        myLinkedListMethod();

    }

    public static void searchTreeMethod() {
        SearchTree searchTree = new SearchTree(null);
        searchTree.traverse(searchTree.getRoot());

        String stringData = "212 323 4948 2 398 910";
        String[] storedData = stringData.split("");

        for (String i : storedData) {
            searchTree.traverse(new Node(i));
        }
        searchTree.traverse(searchTree.getRoot());
        searchTree.removeItem(new Node("3"));
        searchTree.traverse(searchTree.getRoot());

        searchTree.removeItem(new Node("5"));
        searchTree.traverse(searchTree.getRoot());

        searchTree.removeItem(new Node("0"));
        searchTree.removeItem(new Node("4"));
        searchTree.removeItem(new Node("2"));
        searchTree.traverse(searchTree.getRoot());

        searchTree.removeItem(new Node("9"));
        searchTree.traverse(searchTree.getRoot());
        searchTree.removeItem(new Node("8"));
        searchTree.traverse(searchTree.getRoot());
        searchTree.removeItem(new Node("6"));
        searchTree.traverse(searchTree.getRoot());
        searchTree.removeItem(searchTree.getRoot());
        searchTree.traverse(searchTree.getRoot());
        searchTree.removeItem(searchTree.getRoot());
        searchTree.traverse(searchTree.getRoot());
    }

    public static void myLinkedListMethod() {
        MyLinkedList myLinkedList = new MyLinkedList(null);
        myLinkedList.traverse(myLinkedList.getRoot());

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data = stringData.split(" ");
        for (String s : data) {
            // create new item with value set to the string s
            myLinkedList.addItem(new Node(s));
            myLinkedList.traverse(myLinkedList.getRoot());
        }
    }
}
