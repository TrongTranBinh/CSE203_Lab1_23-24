package cse203.lab1.java;

public class Question2 {

    private int number1;
    private int number2;
    private int number3;

    public Question2(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public int findMin() {
        int min = number1;
        min = Math.min((Math.min(min, number2)), number3);
        return min;
    }
}
