public class Calculate implements ICalculator {

    private double result;

    @Override
    public double getResult() {
        return this.result;
    }


    @Override
    public void multiply(double first, double second) {
        this.result = first * second;
    }

    @Override
    public void divide(double first, double second) {
        this.result = first / second;
    }

    @Override
    public void summary(double first, double second) {
        this.result = first + second;
    }

    @Override
    public void sustract(double first, double second) {
        this.result = first - second;
    }

    @Override
    public void exponent(double first, double second) {
        double result = first;

        for (int index = 1; index != second; ++index) {
            result *= first;
        }
        this.result = result;
    }
}
