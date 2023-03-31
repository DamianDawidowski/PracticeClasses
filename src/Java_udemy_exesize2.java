public class Java_udemy_exesize2 {

    public static void main(String[] args) {

 //       toMilesPerHour(0);
       printConversion(3);
 //       int highScore=  (int) toMilesPerHour(-100);
    //    System.out.println("The highScore is " + highScore );
    }
        public static long toMilesPerHour(double kilometersPerHour) {
            double milesPerHour = kilometersPerHour / 1.609;
            long rounded = Math.round(milesPerHour);
            long value = rounded;
        if (kilometersPerHour < 0) {
              value = -1;
        }
      return   value;
    }


   public static void   printConversion(double kilometersPerHour) {
       double milesPerHourRaw =   kilometersPerHour / 1.609;
       long rounded = Math.round(milesPerHourRaw);
       long milesPerHour = rounded;
       if(kilometersPerHour<0) {
           System.out.println("Invalid Value");
       } else
       System.out.println(kilometersPerHour +" km/h = "+milesPerHour +" mi/h");
      }

  }




