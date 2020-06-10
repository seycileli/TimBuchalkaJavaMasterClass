package test;

import entities.FireDragon;
import entities.Monster;

class FireDragonTest {

    private static FireDragon fireDragon = new FireDragon();
    private static Monster monster = new Monster();
    public static void main(String[] args) {

        System.out.println("Enemy " + fireDragon.name() + " has appeared ");
        System.out.println(fireDragon.basicAttack());
//        System.out.println(fireDragon);

    }

    /*
    Very cool to see this working. Now we can improve on this. Instead of adding
    the attack move name and damage in 1 method code block within the Fire Dragon class,

    -- if you're asking or wondering why --
    Because in the future that will be a problem, such as;
    what if our monster has damaged our player? we wouldn't be able to do so with that method
    so therefore, we will create a similar method but with the name
    basicAttackMoveDamage();
    - then set the basic attack move, to a desire amount
    and then return it,
    once done, then we can subtract that amount of damage, to our given players health

    understand? Awesome.
     */



}
