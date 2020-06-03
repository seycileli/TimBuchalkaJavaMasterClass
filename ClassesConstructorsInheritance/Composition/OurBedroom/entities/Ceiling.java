package entities;

public class Ceiling {
    private int ceiling;
    private int paintedColor;

    public Ceiling(int ceiling, int paintedColor) {
        this.ceiling = ceiling;
        this.paintedColor = paintedColor;
    }

    public int getCeiling() {
        return ceiling;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}
