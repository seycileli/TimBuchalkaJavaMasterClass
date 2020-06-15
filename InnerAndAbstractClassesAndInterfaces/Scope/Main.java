package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Changing X method and replacing the param X with Scanner class
//        Scanner s = new Scanner(System.in);
//        X x = new X(s.nextInt());
//        x.x();

        //printing out the param
        X x = new X(new Scanner(System.in));
        x.x();
    }
}
