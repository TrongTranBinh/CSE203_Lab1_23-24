package cse203.lab1.java;

import java.util.Scanner;

public class Question4 {

    private int numberOfElements;

    public Question4(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public int[] getArray() {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[numberOfElements];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap Phan Tu: ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    public int sumAllEvens(int[] a) {
        int sum = 0;
        for (int i : a ) {
            sum += (i % 2 == 0) ? i : 0;
        }
        return sum;
    }
}
