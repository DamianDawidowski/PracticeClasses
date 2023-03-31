public class Java_udemy_exesize19 {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        int digit1First = number1 / 10;
        int digit1Second = number1 % 10;
        int digit2First = number2 / 10;
        int digit2Second = number2 % 10;
        if ((number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99)) {
            return false;
        } else if ((digit1First == digit2First) || (digit1Second == digit2Second) || (digit1First == digit2Second) || (digit1Second == digit2First)) {
            return true;
        } else {
            return false;
        }
    }
}