package entities;

public class Wall {
    private String direction;
    //the direction the wall is facing

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}
