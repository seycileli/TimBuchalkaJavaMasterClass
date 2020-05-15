package LoopExamples;

public class IsEvenNumber {

    public static void main(String[] args) {

        loopOnlyEvenNumber();
    }

    public static boolean isEvenNumber(int n) {
        //this statement will check if n is an even number; if it is even, return back true
        //otherwise, if n != an even number, return back false
//        if((n % 2) == 0) {
//            return true;
//        } else {
//            //otherwise, if n != an even number, return back false
//            return false;
//        }

        //simplified version below
        return ((n % 2) == 0);
    }

    public static void loopOnlyEvenNumber() {
        int start = 0, end = 20, i = 1;

        /**
         * start at 0, and then start automatically increment because start is less than end
         * integer start will loop until start is less than or equaled to end (20)
         *
         * afterwards, we're testing to see, IF the integer start is an even number
         * by using the method that we created earlier isEvenNumber();
         *
         * the continue keyword will cause the loop to immediately jump into the next iteration of the loop
         * if the condition is true via previous method
         */
        while (start <= end) {
            start++;
            //calling previous method that indicates if even number is true or false, if true, continue loop
            if (!isEvenNumber(start)) {
                continue;
            }
//            System.out.println(i++ + ": Even numbers found = " + start);
            System.out.println("Even number found: " + start);
            i++;
            if (i >= 6) {
                break;
            }
        }
        System.out.println("Total even numbers found: = " + i);
    }
}
