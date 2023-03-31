public class Java_udemy_exesize24 {
    public static void main(String[] args) {
   //   System.out.println(getDigitCount(-90));
  //    System.out.println(reverse(0));
     System.out.println(numberToWords(0));


    }

    public static String numberToWords(int number1) {
        String fullPrint = "";
        int digit;
        int devidedNumber = reverse(number1);

        //       = reverse(number1) getDigitCount

        if (number1 >= 0) {
            if (number1==0) {fullPrint += "Zero";}
            while (devidedNumber > 0) {
                digit = devidedNumber % 10;
                switch (digit) {
                    case 0:
                        fullPrint += "Zero ";
                        break;
                    case 1:
                        fullPrint += "One ";
                        break;
                    case 2:
                        fullPrint += "Two ";
                        break;
                    case 3:
                        fullPrint += "Three ";
                        break;
                    case 4:
                        fullPrint += "Four ";
                        break;
                    case 5:
                        fullPrint += "Five ";
                        break;
                    case 6:
                        fullPrint += "Six ";
                        break;
                    case 7:
                        fullPrint += "Seven ";
                        break;
                    case 8:
                        fullPrint += "Eight ";
                        break;
                    case 9:
                        fullPrint += "Nine ";
                        break;
                }
                devidedNumber /= 10;
            }
        } else {
            System.out.println("Invalid Value");
        }
        //     System.out.println(fullPrint);
        int desiredDigitalCount = getDigitCount(number1);
        int activeDigitalCount = getDigitCount(reverse(number1));
        while ((desiredDigitalCount > activeDigitalCount)) {
            fullPrint += "Zero ";
            desiredDigitalCount -= 1;

        }
                 return fullPrint;
     //   System.out.println(fullPrint);
    }
        public static int reverse ( int number1){
            int reversedNumber = 0;
            int devidedNumber = number1;
            while (devidedNumber != 0) {
                reversedNumber += devidedNumber % 10;
                devidedNumber /= 10;
                reversedNumber *= 10;
            }
            reversedNumber /= 10;
            return reversedNumber;
        }
        public static int getDigitCount ( int number1){
            int digitCount = 0;
            int devidedNumber = number1;
            if (number1==0) {digitCount++;}
            if (number1<0) {digitCount=-1;}
            while (devidedNumber > 0) {
                devidedNumber /= 10;
                digitCount++;
            }
            if (number1<0) {digitCount=-1;}
            return digitCount;
        }
    }

