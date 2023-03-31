public class Java_udemy_exesize20 {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(22, 23,34));
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        int numberLast1 = number1 % 10;
        int numberLast2 = number2 % 10;
        int numberLast3 = number3 % 10;


        if ((number1 < 10) || (number2 < 10) || (number3 < 10) || (number1 > 1000) || (number2 > 1000) || (number3 > 1000)) {
            return false;
        } else if ((numberLast1 == numberLast2) || (numberLast1 == numberLast3) || (numberLast3 == numberLast2)) {
            return true;
        } else {
            return false;
        }

    }
    public static boolean isValid(int number4) {
        if ((number4<10)||(number4>1000)) {
            return false;
        }
        else {
            return true;
        }
    }


}
