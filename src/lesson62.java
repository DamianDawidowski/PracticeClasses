public class lesson62 {
    public static void main(String[] args) {
    int i = 1;
    int sum=0;
    int count = 0;
       for( i = 1; i <= 1000; i++) {
           if ((i%3==0) && (i%5==0)) {
               System.out.println("Number " + i + " is divisible by 3 and 5.");
               sum += i;
               count++;
           }
           if (count== 5) {

               break;
           }

           }
        System.out.println("Sum of all found numbers is "+sum+".");
       }














}
