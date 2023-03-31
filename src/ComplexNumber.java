public class ComplexNumber {

    private double  real;
    private double imaginary;


    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    public void add(double real, double imaginary) {
        this.real+=real;
        this.imaginary+=imaginary;
    }

    public void add(ComplexNumber xy) {
        this.real+=xy.real;
        this.imaginary+=xy.imaginary;
    }
    public void  subtract(double real, double imaginary) {
        this.real-=real;
        this.imaginary-=imaginary;
    }

    public void  subtract(ComplexNumber xy) {
        this.real-=xy.real;
        this.imaginary-=xy.imaginary;
    }





    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
}
