public class Java_udemy_exesize10 {
    public static void main(String[] args) {
        //    System.out.println(printYearsAndDays(111111));
        //      System.out.println(area(-2,4));
        printYearsAndDays(5600);
    }
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.print("Invalid Value");
        } else {
            int days = (int) minutes / (60 * 24);
            int years = days / 365;
            days = days % 365;
            System.out.print(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}