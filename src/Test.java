public class Test {
    public static void main(String[] args) {
  //      System.out.println(primeCounter(33));
 //       System.out.println(isPrime(79));
//        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
//        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
//        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");
//
//        System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number");
//        System.out.println("17 is " + (isPrime(17) ? "" : "NOT ") + "a prime number");

//    public static int primeCounter(int maxNumber) {
  //      int maxNumber = 1000;
        int primeCount = 0;
        for (int i = 0; i <= 100000; i++) {
            if (isPrime(i) == true) {
                primeCount++;
                System.out.println("The found prime is "+i);
            }
           if (primeCount == 3) {
            break;
            }
        }

       System.out.println("The number of primes is "+primeCount);
    }
    public static boolean isPrime(int wholeNumber)  {
if (wholeNumber <=2)
{ return (wholeNumber ==2);}
for (int divisor=2; divisor <wholeNumber; divisor++) {
    if(wholeNumber%divisor==0) {
        return false;
    }
}
    return true;
    }
}