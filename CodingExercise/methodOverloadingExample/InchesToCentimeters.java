public class InchesToCentimeters {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(6, 0);
        System.out.println("=============================================");
        calcFeetAndInchesToCentimeters(100);
        System.out.println("=============================================" + "\n" +
                "The first println is from the 2nd method signature with 1 parameter." + "\n"
        + "The second println is from the first method signature with 2 parameters.");

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet and/ or inches");
            return -1; //why return -1? to test for validation and if calculations are correct
        }

        double centimeters = (feet * 12) * 2.54; //12 inches makes a foot
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm");

        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid inches");
            return -1;
        }

        double feet = (int) inches / 12; //casting int, because we want WHOLE number
        double remainingInches = (int) inches % 12; //casting int
        System.out.println(inches + " inches is equal to "
                        + feet + " feet and " +
                        remainingInches + " inches");

        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

}
