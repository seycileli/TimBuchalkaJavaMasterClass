package bonus;

public class Palindrome {

    public static void main(String[] args) {

        palindromeInt(101);
        palindromeInt(201);
        palindromeString("anna");
        palindromeString("michael");

    }

    public static boolean palindromeInt(int number) {
        int reverse = 0;
        int originalNumber = number;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }

        if (originalNumber == reverse) {
            System.out.println(originalNumber + " is a Palindrome");
            return true;
        } else {
            System.out.println(originalNumber + " is not a Palindrome");
            return false;
        }
    }

    public static String palindromeString(String s) {
        StringBuffer sb = new StringBuffer(s);

        if (s.equals(sb.reverse().toString())) {
            System.out.println(s + " is a Palindrome");
        } else {
            System.out.println(s + " is not a Palindrome");
        }
        return s;
    }
}
