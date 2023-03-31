public class Java_udemy_exesize22 {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(22, 44 ));
    }

    public static int getGreatestCommonDivisor(int number1, int number2) {
        int i = 2;
        int greatestDevisor =1;
        if ((number1<10)|| (number2<10)){
            return greatestDevisor=-1;
        } else {
            while (i <= number1) {
                if ((number1 % i == 0) && (number2 % i == 0)){
                    greatestDevisor =i;}
                i++;}

            return greatestDevisor;
        }
    }
}