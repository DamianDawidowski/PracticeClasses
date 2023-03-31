public class lesson66 {
    public static void main(String[] args) {
        System.out.println(sumDigits( 3));
    }

    public static int sumDigits(int number) {
        int sum=0;
        if (number<0) {return sum=-1;}
        while (number> 0) {
            sum+=number%10;
        number/=10;
        }
        return sum;
    }
}