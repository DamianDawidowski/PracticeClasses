public class Java_udemy_exesize15 {
    public static void main(String[] args) {
       System.out.println(sumOdd(-1,2222));
    }

    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        } else if (number % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
    public static int sumOdd(int start, int end) {
        int sumOfAllOdd = 0;
        if ((end < start) || (end < 0) || (start < 0)) {
           return sumOfAllOdd = -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sumOfAllOdd += i;

                }
            }
            return sumOfAllOdd;
        }
    }
}
