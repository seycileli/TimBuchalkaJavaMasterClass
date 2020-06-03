package videoGameEncapsulation;

public class Main {

    public static void main(String[] args) {
        player1();
        encapsulatedPlayer();

    }

    private static void player1() {
        Player player = new Player();
        player.name = "Aedom";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Player has taken " + damage + " damage " +
                player.healthRemaining());

        player.health = 200;
        System.out.println("Player has found full potion. " + "\n" +
                "Players current health is at " +
                player.health + ".");

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Player has taken " + damage + " damage " +
                ". Current health is at " + player.healthRemaining());

    }

    public static void encapsulatedPlayer() {
        System.out.println("\n" + "New Game" + "\n");
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Han Supreme", 100, "Sword");
        System.out.println("Player name: " + enhancedPlayer.getName());
        System.out.println("Initial health: " + enhancedPlayer.getHealth());
        System.out.println("Player weapon: " + enhancedPlayer.getWeapon());
    }

}
