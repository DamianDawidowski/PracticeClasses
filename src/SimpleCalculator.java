public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult() {
        double sumFirstSecond = firstNumber+secondNumber;
        return sumFirstSecond;
    }
    public double getSubtractionResult() {
        double differenceFirstSecond = firstNumber-secondNumber;
        return differenceFirstSecond;
    }

    public double getMultiplicationResult() {
        double multiplyFirstSecond = firstNumber*secondNumber;
        return multiplyFirstSecond;
    }


    public double getDivisionResult() {
        double divideFirstSecond;
        if (secondNumber == 0) {
            return divideFirstSecond = 0;
        } else {
            divideFirstSecond = firstNumber/secondNumber;
            return divideFirstSecond;
        }
    }
}
