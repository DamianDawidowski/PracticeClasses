package Scope.com.damian;

public class lesson177 {
    public static int multiplier = 7;


    public static void main(String[] args) {
//StaticTest firstInstance = new StaticTest("1st Instance");
//System.out.println(firstInstance.getName()+" is instance number "+StaticTest.getNumInstance());
//
//        StaticTest secondInstance = new StaticTest("2nd Instance");
//        System.out.println(secondInstance.getName()+" is instance number "+StaticTest.getNumInstance());
      int answer = multiply(6);
        System.out.println("The answer is " +answer);
        System.out.println("The answer is " +multiplier);
    }
public static int multiply(int number) {
        return number*multiplier;
}


}
