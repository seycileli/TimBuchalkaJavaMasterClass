class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {

    public Jaws() {
        /*
        //initializing movie name in super class
        using inheritance to initialize the name field from the base class
         */
        super("Jaws");
    }

    public String plot() {
        return "A Shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over Planet Earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the Universe";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }

    //no plot method
}

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                    " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }

    }

    public static Movie randomMovie() {
        /*
        purpose of this method is to return a random movie

        why (Math.random() * 5) + 1? Because;
        Math.random() returns a number from 0-1, but we multiply it by the amount of movies (classes)
        we've built

        Math.random() * 5, will be 0 - 4, because Java starts at zero,
        that is why we added the + 1;
         */
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();
        }
        return null;
    }
}
