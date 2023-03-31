public class Java_udemy_exesize14 {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2 ,11500));
    }

    public static boolean isLeapYear(int year) {
        if (year <= 0 || year > 9999) {
            return false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        int numberOfDays;

           if ((month<1) ||(month>12)) {
            return numberOfDays=-1;
        }
        else if ((year<1) ||(year>9999)) {
            return numberOfDays=-1;
        }

        else if ((isLeapYear(year)) && (month == 2)) {
            return numberOfDays = 29;
        } else if ((isLeapYear(year) == false) && (month == 2)) {
            return numberOfDays = 28;
        } else if ((month<1) ||(month>12)) {
            return numberOfDays=-1;
                    }
        else if ((year<1) ||(year>9999)) {
            return numberOfDays=-1;
        }
        else {

            switch (month) {
                case (1):
                case (3):
                case (5):
                case (7):
                case (8):
                case (10):
                case (12):
                    return numberOfDays = 31;
                       case (4):
                case (6):
                case (9):
                case (11):
                    return numberOfDays = 30;
            }
        }return numberOfDays=-1;
    }
}