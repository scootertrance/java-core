class Factorial {
    public static double getFactorial(double number) {
        double result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
