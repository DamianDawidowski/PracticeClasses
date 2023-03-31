public class Java_udemy_exesize5 {

    public static void main(String[] args) {

    }

    public static boolean isLeapYear(int year) {
        if(year<=0 || year>9999) {
            return false;
        }
        else if (year%4==0 && year%100!=0) {
            return true;
        }
        else if(year%400==0) {
            return true;
        }else {return false;}
    }


}