public class Java_udemy_exesize12 {
    public static void main(String[] args) {
        //    System.out.println(printYearsAndDays(111111));
        System.out.println( isCatPlaying(false,36));

    }
    public static boolean isCatPlaying(boolean summer, int temperature) {
 if (((summer == true) && (temperature>=25)) && ((summer == true) && (temperature <=45))) {

    return true;
}
 else if ((summer == false) && ((temperature>=25) && (temperature <=35))) {
     return true;
 }
else {
    return false;
}

    }
}
