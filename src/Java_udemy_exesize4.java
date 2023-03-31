public class Java_udemy_exesize4 {


    public static void main(String[] args) {

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if((barking==true) && ((hourOfDay>=0 && hourOfDay <8) || (hourOfDay >22 && hourOfDay <=23))) {
            return true;
        }
             else  {
            return false;
        }


}}