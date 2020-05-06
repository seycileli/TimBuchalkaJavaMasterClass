public class BarkingDog {

    public static void main(String[] args) {
        
        shouldWakeUp(true, 1); //should return true
        shouldWakeUp(false, 2); //should return false since the dog is not barking
        shouldWakeUp(true, 8); //should return false, since it's not before 8
        shouldWakeUp(true, -1); //should return false since the hourOfDay parameter needs to be in a range of 0-23

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        } else {
            return false;
        }
    }
    
}
