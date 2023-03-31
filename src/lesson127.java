import java.util.Arrays;

public class lesson127 {
    public static void main(String[] args) {
        int[] testArray = new int[]{1,2,4,54,12,545,66};
        System.out.println(Arrays.toString(testArray));
        System.out.println(Arrays.toString(reverse(testArray)));
    }

    private static int[] reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        int temp  ;
        for (int i = 0; i < array.length; i++) {
        reversedArray[i] = array[array.length-1-i];
        }
        return reversedArray;
    }








}
