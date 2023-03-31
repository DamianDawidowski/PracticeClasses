import java.util.Scanner;

public class lesson126 {
    public static void main(String[] args) {
        System.out.println((findMin(readIntegers())));

    }
    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers, separated by commas :");
        String input = (scanner.nextLine());
        scanner.close();

        String[] splitStrings = input.split(",");

        int len = splitStrings.length;
        int[] intArray = new int[len];

        for(int i=0;i<len;i++) {
        intArray[i] = Integer.parseInt(splitStrings[i]);
        }       return intArray;
    }
    private static int findMin(int[] array) {
        int minInt = array[0];
        for (int i = 1; i < array.length; i++) {

            if (array[i] < minInt) {
                minInt = array[i];
            }
        }
        return minInt;
    }
}


