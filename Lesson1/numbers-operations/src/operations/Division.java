package operations;

class Division {
    public static void getDivision(MyNumbers myNumbers) {

        double dividend = myNumbers.getNumber1();
        double divider = myNumbers.getNumber2();
        if (divider == 0) {
            System.out.println("Division by zero");
        }
        else {
            double division = dividend / divider;
            System.out.println(division);
        }
    }
}
