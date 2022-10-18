package operations;

public class Operations {
    public static void main(String[] args) {
        try {
            MyNumbers myNumb = new MyNumbers(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            String operation = args[2]; // An executable operation;

            switch (operation) {
                case "sum":
                    Sum.getSum(myNumb);
                    break;
                case "multiplication":
                    Multiplication.getMultiPlay(myNumb);
                    break;
                case "subtraction":
                    Subtraction.getSubtraction(myNumb);
                    break;
                case "division":
                    Division.getDivision(myNumb);
                    break;
                default:
                    System.out.println("Available operations: sum, multiplication, subtraction, division.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Wrong data type. Enter a two numbers.");
        }
    }
}
