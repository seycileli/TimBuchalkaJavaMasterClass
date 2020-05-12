public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

    }
    
    public static void printYearsAndDays(long minutes) {
        long yy = minutes / 525600;
        long zz = minutes % 525600;
        zz = zz / 1440;

        if (minutes < 0) {
            System.out.println("Invalid value");
        } else {
            System.out.println(minutes + " min = " + yy + " y " + zz + " d");
        }
    }
}
