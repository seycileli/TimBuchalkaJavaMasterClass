public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(11, 20, 31)); //true
        System.out.println(hasSameLastDigit(12, 30, 48)); //false
        System.out.println(hasSameLastDigit(9, 300, 78)); //false because firstNum < 10
    }

    public static boolean isValid(int NumberValidation) {
        return NumberValidation >= 10 && NumberValidation <= 1000;
    }

    public static boolean hasSameLastDigit(int firstNum, int secNum, int thirdNum) {
        if (isValid(firstNum) && isValid(secNum) && isValid(thirdNum)) {

            int checkFirst = firstNum % 10;
            int checkSecond = secNum % 10;
            int checkThird = thirdNum % 10;

            return checkFirst == checkSecond || checkFirst == checkThird ||
                    checkSecond == checkThird;
        }
        return false;
    }
}
