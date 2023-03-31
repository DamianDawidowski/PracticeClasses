public class Challenge_59 {
    public static void main(String[] args) {
        printDayofWeek(4);
        printWeekDay(1);
 //       System.out.println(printWeekDay(6));
    }
    public static void  printDayofWeek (int day) {
            String dayofWeek =   switch (day) {
             case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";};
            System.out.println(day + " is "+dayofWeek);
        }

           public static void  printWeekDay (int day) {
               String dayofWeek;
            if(day==0) {dayofWeek =  "Sunday";}
            else if (day==1) {dayofWeek =  "Monday";}
            else if (day==2) {dayofWeek =  "Tuesday";}
            else if (day==3) {dayofWeek =  "Wednesday";}
            else if (day==4) {dayofWeek =  "Thursday";}
            else if (day==5) {dayofWeek =  "Friday";}
            else if (day==6) {dayofWeek =  "Saturday";}
            else   {dayofWeek =  "Invalid day";}
               System.out.println(day + " is "+dayofWeek);
        }
    }


