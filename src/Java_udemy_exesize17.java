public class Java_udemy_exesize17 {
    public static void main(String[] args) {
         System.out.println(sumFirstAndLastDigit( 5));
    }

    public static int sumFirstAndLastDigit(int number) {
        int firstDigit = 0;
        int lastDigit = number % 10;
        int sum;
        int numberCheck = number;
        if (number < 0) {
            sum = -1;
        } else {
            while (numberCheck != 0) {
                   if ((numberCheck < 10) && (numberCheck > -10)) {
                    firstDigit = numberCheck;
                    break;
                }
                numberCheck /= 10;
            }
            sum = firstDigit + lastDigit;
        }
            return sum;
    }
    }