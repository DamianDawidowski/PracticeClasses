public class Java_udemy_exesize9 {
    public static void main(String[] args) {
System.out.println(area(2));
        System.out.println(area(-2,4));


    }
    public static double area (double radius) {
        double area;
        if (radius<0) {
            return area = -1.0;
        }
        area = Math.PI * (radius * radius);
        return area;
    }
    public static double area (double x, double y) {
        double area;
        if ((x<0) || (y<0)) {
            return area = -1.0;
        }
        area = x * y;
        return area;
    }


}
