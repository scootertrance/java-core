import java.util.*;

class MainClass {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in); // Input of side lengths
            System.out.println("Enter length(>0) of the sideA: ");
            double sideA = scan.nextDouble();
            System.out.println("Enter length(>0) of the sideB: ");
            double sideB = scan.nextDouble();
            System.out.println("Enter length(>0) of the sideC: ");
            double sideC = scan.nextDouble();
            System.out.println("Enter length(>0) of the sideD: ");
            double sideD = scan.nextDouble();
            System.out.println("Enter length(>0) of the sideE: ");
            double sideE = scan.nextDouble();

            // Creating a new object of class MyNumbers
            MyNumbers myNumbers = new MyNumbers(sideA, sideB, sideC, sideD, sideE);

            // Checking if all sides are greater than zero
            if (sideA <= 0 | sideB <= 0 | sideC <= 0 | sideD <= 0 | sideE <= 0) {
                System.out.println("Wrong input data. You must enter a number > 0");
            } else {
                double areaOfPentagon = AreaOfPentagon.getAreaOfPentagon(myNumbers);
                System.out.printf("Area of pentagon is: %.4f", areaOfPentagon);
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong input data. You must enter a number."); // Numeric input validation
        }
    }
}