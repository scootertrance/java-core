package operations;

class Sum {
    public static void getSum(MyNumbers myNumbers) {
        int sum = myNumbers.getNumber1() + myNumbers.getNumber2();
        System.out.println(sum);
    }
}
