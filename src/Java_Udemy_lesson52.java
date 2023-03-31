public class Java_Udemy_lesson52 {
    public static void main(String[] args) {
        System.out.println("The height is "+convertToCentimeters(5, 8));
        System.out.println("The height is "+convertToCentimeters(84));
    }
    public static double convertToCentimeters(int heightInches) {
       double heightCentimeters = heightInches * 2.54;
       return heightCentimeters;
    }

    public static double convertToCentimeters(int heightFeet, int heightInchesRemain) {
        int heightInches = heightFeet * 12 + heightInchesRemain;
       double heightCentimeters = convertToCentimeters(heightInches);
        return heightCentimeters;
    }


}