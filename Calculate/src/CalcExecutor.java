public class CalcExecutor {

    public static void main(String[] args) {
        Calculate calculate=new Calculate();
        calculate.divide(56,98.3);
        System.out.println(calculate.getResult());
        calculate.exponent(3,3);
        System.out.println(calculate.getResult());
        calculate.multiply(34,98);
        System.out.println(calculate.getResult());
    }
}
