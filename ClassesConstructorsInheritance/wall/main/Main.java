package wall;

import java.util.Scanner;

public class Main {
    private static Scanner sc;
    private int selection = sc.nextInt();
    private static Wall wall = new Wall(5, 4);
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        System.out.println("area = " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());

    }
}
