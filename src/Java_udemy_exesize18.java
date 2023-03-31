public class Java_udemy_exesize18 {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-1112));
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        int numberCheck = number;
        if (number < 0) {
             sum = -1;
        }
        else {
            while (numberCheck != 0) {


                if (numberCheck % 2 == 0) {
                    sum += numberCheck % 10;
                }
                numberCheck /= 10;
            }
                    }
        return sum;
    }
    }