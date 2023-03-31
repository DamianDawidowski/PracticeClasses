import java.util.Scanner;

public class Java_udemy_lesson73 {
   

    public static void main(String[] args) {
        int number = 5;
        System.out.println(readNumbersFromScanner(5));
    }

    public static int readNumbersFromScanner(int number) {
        Scanner scanner = new Scanner(System.in);
//        number = 5;
        int x = 1;
        int sum = 0;
        for (x = 1; x <= number; x++) {
//                       int badData;
            int badData;
            int enteredNumber = 0;
            do {
                badData = 0;
                System.out.println("Enter number #" + x + ":");
                try {
                    enteredNumber = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException badUserData) {
                    System.out.println("Invalid number.");
                    badData = 1;
                }

            } while (badData == 1);
            sum += enteredNumber;
        }
        return sum;
    }
}
//            } while (!validDOB);
//
//
//                String name = System.console().readLine("Hi, please input the first number ");
//                System.out.println("Hi "+name+", Thanks for taking the course!");
//                String dateOfBirth = System.console().readLine("What year were you born");
//                int age = currentYear - Integer.parseInt(dateOfBirth);
//                return "So you are " + age + " years old";
//            }


////            do while
////        }scanner object and next line method to read input as a string
////                use integer parse int