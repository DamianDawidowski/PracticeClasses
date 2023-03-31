public class Java_udemy_exesize27 {
    public static void main(String[] args) {
        printSquareStar( 2);
    }

    public static void printSquareStar(int number) {
          int currentRow;
        int currentColumn;
        if (number<5) {
            System.out.print("Invalid Value");}
        for (currentRow = 1; currentRow <= number; currentRow++) {
            if (number<5) {
                break;}
            for (currentColumn = 1; currentColumn <= number; currentColumn++) {

                if (currentRow == 1)  {
                    System.out.print("*");
                }

                else if (currentColumn == 1) {
                    System.out.print("*");
                }
                else if (currentColumn == number) {
                    System.out.print("*");
                }
                else if (currentColumn==currentRow) {
                    System.out.print("*");
                }
                else if (currentColumn==(number-currentRow)+1) {
                    System.out.print("*");
                }

                else if (currentRow == number) {
                    System.out.print("*");
                }
else {
                    System.out.print(" ");
                }
            }
            if (currentRow == number) {break;}
            System.out.println("");
        }
    }
}