public class Java_udemy_exesize21 {
    public static void main(String[] args) {
        printFactors(3);
    }

    public static void printFactors(int number1) {
        int i = 1;
        if (number1<1) {
            System.out.println("Invalid Value");
        } else {
        while (i <= number1) {
            if (number1 % i == 0) {
                 System.out.println(i);}
            i++;
            }
        }
    }
    }