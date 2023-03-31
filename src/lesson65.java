public class lesson65 {
    public static void main(String[] args) {
        int number = 5;
        int numberOdd=0;
        int numberEven=0;
        while (number<=20) {
            if (numberEven==5) {break;}
            else if (isEvenNumber(number)) {
                System.out.println("Even number "+number+ " found.");
                numberEven++;
            }
            else if (!isEvenNumber(number)) {
                           numberOdd++;
            }

            number++;
        }
        System.out.println("Total number of "+numberEven+" even and "+numberOdd+ " odd numbers found.");
    }
    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    }