package Scope.com.damian;

public class X {
   private int x;


    public X(int x) {
        this.x = x;
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//         this.x = scanner.nextInt();
//x();
//
//    }
    //public static void x(String[] args) {
    public   void x() {

        for (int x = 1; x <= 12; x++) {


            System.out.println( x + " times " +this.x+ " is " +  this.x*x);


        }
    }
}