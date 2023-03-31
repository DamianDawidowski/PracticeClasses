public class Java_udemy_exesize26 {
    public static void main(String[] args) {
        System.out.print(getLargestPrime(21));
    }

    public static int getLargestPrime(int number) {
        int largestPrime = 2;
        if (number < 2) {
            largestPrime = -1;
        } else
        {
            int i = number;
            boolean isPrime = false;
//            int i = 4;
            while (i > 0) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    } else {
                        isPrime = true;
                    }
                }
                if ((number % i == 0) && (isPrime)) {
                    largestPrime = i;
                    break;

                }

                i--;
            }
        }

            return largestPrime;
    }
}

