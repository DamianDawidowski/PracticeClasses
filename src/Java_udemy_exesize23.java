public class Java_udemy_exesize23 {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(8128));
    }

    public static boolean isPerfectNumber(int number1) {
        int i = 1;
        int perfectNumberSum = 0;
        if (number1 < 1) {
            return false;
        } else {
            while (i < number1) {
                if (number1 % i == 0) {
                    perfectNumberSum += i;
                }
                i++;

            }
            if (perfectNumberSum == number1) {
                return true;
            } else {
                return false;
            }
        }
    }
}