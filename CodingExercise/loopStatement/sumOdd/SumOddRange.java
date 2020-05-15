public class SumOddRange {
    public static void main(String[] args) {

        sumOdd(1, 100); //should return 2500
        sumOdd(-1, 100); //should return -1
        sumOdd(100, 100); //should return 0
        sumOdd(13, 13); //should return 13 (This set contains one number, 13, and it is odd)
        sumOdd(100, -100); //should return -1
        sumOdd(100, 1000); //should return 247500
        
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 == 1) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;

        if(end >= start && start > 0 && end > 0) {
            for(int i = start; i <= end; i++) {
                if (isOdd(i) == true) {
                    System.out.println(i);
                    sum = sum + i;
                }
            }
            return sum;
        } else {
            return -1;
        }
    }

    //testing, playing around
    public static void oddNumbers() {
        for(int i = 0; i < 100; i++) {
            System.out.println(1 + (i * 2));

            if(i == 49) {
                break;
            }
        }
    }

    public static void evenNumbers() {
        for(int i = 0; i <= 50; i++){
            System.out.println(i * 2 + " ");
        }
    }
}
