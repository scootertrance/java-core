class CalculateFactorial {
    public static void main(String[] args) {
        double result = (2 * Factorial.getFactorial(5) + 3 * Factorial.getFactorial(8)) /
                (Factorial.getFactorial(6) + Factorial.getFactorial(4));
        System.out.printf("%.4f",result);
    }
}
