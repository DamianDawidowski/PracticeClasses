import java.util.Scanner;

public class Java_udemy_exersize74 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int badData;
        int maximumNumber=0;
        int minimumNumber=0;
        int enteredNumber;
        for (int i = 1; i < 2; i--) {


            if (i == 1) try {
                System.out.println("Enter a number");
                enteredNumber = Integer.parseInt(scanner.nextLine());
                maximumNumber = enteredNumber;
                minimumNumber = enteredNumber;
                System.out.println("The largest entered number is "+maximumNumber+".");
                System.out.println("The smallest entered number is "+minimumNumber+".");

            } catch (NumberFormatException badUserData) {
                System.out.println("Invalid number.");
                break;
             }
            System.out.println("Enter a number");
            try {
                enteredNumber = Integer.parseInt(scanner.nextLine());
                if (enteredNumber > maximumNumber) {
                    maximumNumber = enteredNumber;
                } else if (enteredNumber < minimumNumber) {
                    minimumNumber = enteredNumber;
                }
                System.out.println("The largest entered number is "+maximumNumber+".");
                System.out.println("The smallest entered number is "+minimumNumber+".");
            } catch (NumberFormatException badUserData) {
                System.out.println("Invalid number.");
                break;
            }
        }
    }
}

