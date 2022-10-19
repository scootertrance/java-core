class MyNumbers {
    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;
    private double sideE;
    private double sideG;
    private double sideF;

    MyNumbers(double sideA, double sideB, double sideC, double sideD, double sideE) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.sideE = sideE;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double getSideD() {
        return sideD;
    }

    public double getSideE() {
        return sideE;
    }

    public double getSideG() {
         sideG = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2)); // Calculating the hypotenuse from two legs
         return sideG;
    }

    public double getSideF() {
        sideF = Math.sqrt(Math.pow(sideC, 2) + Math.pow(getSideG(), 2)); // Calculating the hypotenuse from two legs
        return sideF;
    }
}
