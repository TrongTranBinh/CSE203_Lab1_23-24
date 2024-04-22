package cse203.lab1.java;

public class Question3 {

    private int number;

    public Question3(int number) {
        this.number = number;
    }

    public void displayHailstoneSequence() {
        int n = number;
        while (n != 1) {
            System.out.print((n % 2 == 0) ? n + " is even so we take n/2: " : n + " is odd, so we take 3*n+1: ");
            n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
            System.out.print(n+"\n");
        }
    }
}
