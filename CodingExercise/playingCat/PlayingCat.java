public class PlayingCat {
    public static void main(String[] args) {

        isCatPlaying(true, 10);
        //should return false since temperature is not in range 25 - 45
        isCatPlaying(false, 36);
        //should return false since temperature is not in range 25 - 35 (summer parameter is false)
        isCatPlaying(false, 35);
        //should return true since temperature is in range 25 - 35

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer && (temperature >= 25 && temperature <= 45)) {
            return true;
        } else if (temperature >= 25 && temperature <= 35) {
            return true;
        }
        return false;
    }
}
