package operations;

public class Operations {
    public static void main(String[] args) {
        MyNumbers myNumb = new MyNumbers(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        String operation = args[2]; // An executable operation;
        switch (operation) {
            case "sum":
                Sum.getSum(myNumb);
                break;
            case "multiplay" :
                Multiply.getMultiPlay(myNumb);
            case "subtraction" :
                Subtraction.getSubtraction(myNumb);
            case "division" :
                Division.getDivision(myNumb);
        }
    }
}
