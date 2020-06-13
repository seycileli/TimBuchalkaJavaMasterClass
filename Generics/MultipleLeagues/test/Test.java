package test;

import entities.BasketballPlayer;
import entities.League;
import entities.Team;

public class Test {

    public static void main(String[] args) {

        nba();

    }

    public static void nba() {
        League<Team<BasketballPlayer>> nba = new League<>("NBA");
        Team<BasketballPlayer> losAngelesLakers = new Team<>("Los Angeles Lakers");
        Team<BasketballPlayer> losAngelesClippers = new Team<>("Los Angeles Clippers");
        Team<BasketballPlayer> houstonRockets = new Team<>("Houston Rockets");
        Team<BasketballPlayer> denverNuggets = new Team<>("Denver Nuggets");

        nba.add(losAngelesLakers);
        nba.add(losAngelesClippers);
        nba.add(houstonRockets);
        nba.add(denverNuggets);

        System.out.println("\n Game 1 of the Western Conference Semi Finals Results: \n");
        losAngelesClippers.matchResult(losAngelesLakers, 101, 98);
        houstonRockets.matchResult(denverNuggets, 123, 111);
        System.out.println("\n Current Standings: ");
        nba.showLeagueTable();

        System.out.println("\n Game 2 of the Western Conference Semi Finals Results: \n");
        losAngelesClippers.matchResult(losAngelesLakers, 100, 108);
        houstonRockets.matchResult(denverNuggets, 118, 90);
        System.out.println("\n Current Standings: ");
        nba.showLeagueTable();

    }

}
