public class SecondsAndMinutesBonus {

    public static void main(String[] args) {

        System.out.println(getDurationString(11, 43));

    }

    private static String getDurationString (long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }

        long hours = minutes / 60; //amount of minutes divided by the hour
        long remainingMinutes = minutes % 60; //total minutes

        String hourString = hours + "h";
        if (hours < 10) {
            hourString = "0" + hourString;
        }

        String minuteString = remainingMinutes + "m";
        if (remainingMinutes < 10) {
            minuteString = "0" + minuteString;
        }

        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hourString + " " + minuteString + " " + secondsString;
    }
}
