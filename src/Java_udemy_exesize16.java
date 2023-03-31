public class Java_udemy_exesize16 {
    public static void main(String[] args) {
        System.out.println(isPalindrome( -232321));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
int numberCheck = number;
        while (numberCheck != 0) {
            int lastDigit = numberCheck % 10;
            reverse *= 10;
            reverse += lastDigit;
            numberCheck /= 10;

        }
        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }
}