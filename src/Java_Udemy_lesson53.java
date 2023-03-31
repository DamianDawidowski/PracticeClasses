public class Java_Udemy_lesson53 {
    public static void main(String[] args) {
        System.out.println( getDurationString(241, 4));
        System.out.println( getDurationString( -155522));
    }
    public static String getDurationString(int seconds) {
        int minutes;
      minutes = seconds/60;
        seconds=seconds%60;
        String output;

        if (seconds < 0) {
            return output = "Seconds out of range";
        } else {
            return getDurationString(minutes, seconds);
        }
    }
    public static String getDurationString(int minutes, int seconds) {
  //     int totalseconds = seconds + minutes*60;

        minutes+=seconds/60;
        String output;
        int hours = minutes / 60;
        int totalminutes = minutes%60;
        if(seconds<0 || seconds>60) {
           return  output = "Seconds out of range";
        } else if (minutes<0) {
            return   output = "Minutes out of range";
        }
        else {
          return output = hours + "h " + totalminutes + "m " + seconds + "s'";
        }

    }

}