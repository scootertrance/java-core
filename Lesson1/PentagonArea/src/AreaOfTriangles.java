class AreaOfTriangles {

    public static double getAreaOfFirstTriangle(MyNumbers myNumbers) {
        double AreaOfFirstTriangle = (myNumbers.getSideA() * myNumbers.getSideB()) / 2; // Area of the first triangle
        return AreaOfFirstTriangle;
    }

    public static double getAreaOfSecondTriangle(MyNumbers myNumbers) {
        double AreaOfSecondTriangle = (myNumbers.getSideC() * myNumbers.getSideG()) / 2; //Area of the second triangle
        return AreaOfSecondTriangle;
    }

    public static double getAreaOfThirdTriangle(MyNumbers myNumbers) {

        // Semiperimeter of the third triangle
        double p = (myNumbers.getSideD() + myNumbers.getSideE() + myNumbers.getSideF()) / 2;

        // Check for compatibility of side lengths
        if ((p - myNumbers.getSideD()) <= 0 | (p - myNumbers.getSideE()) <= 0 | (p - myNumbers.getSideF()) <= 0) {
            System.out.println("Wrong input data. The numbers do not fit the pentagon.");
            System.exit(0);
        }
        double AreaOfThirdTriangle = Math.sqrt(p * (p - myNumbers.getSideD()) * (p - myNumbers.getSideE()) *
                (p - myNumbers.getSideF())); // Area of the third triangle
        return AreaOfThirdTriangle;
    }
}
