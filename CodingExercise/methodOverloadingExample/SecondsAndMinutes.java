public class SecondsAndMinutes {

    public static void main(String[] args) {
    
        //method overloading exercise

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));

    }

    public static String getDurationString (long minutes, long seconds) {

        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        }

        long hours = minutes / 60; //input minutes divided by amount of minutes in an hour
        long remainingMinutes = minutes % 60; //calculating how many minutes in 1 hour

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    public static String getDurationString (long seconds) {

        if (seconds < 0) {
            return "Invalid value";
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}
