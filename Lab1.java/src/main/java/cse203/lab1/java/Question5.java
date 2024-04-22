package cse203.lab1.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Question5 {

    private ArrayList<ElementQ5> element;

    public Question5(ArrayList<ElementQ5> element) {
        this.element = element;
    }

    public Question5() {
    }

    public void getArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        element = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            ElementQ5 ele = new ElementQ5(sc.nextInt());
            element.add(ele);
        }
    }

    public void removeFirstSpecific() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter specific number : ");
        int specific = sc.nextInt();
        for (ElementQ5 i : element) {
            if (i.getNumber() == specific) {
                element.remove(i);
                break;
            }
        }
    }

    public void replaceElement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number and position: ");
        ElementQ5 number = new ElementQ5(sc.nextInt());
        int position = sc.nextInt();
        element.add(position, number);
        element.remove(element.size()-1);
    }

    public void displayArray() {
        for (ElementQ5 i : element) {
            System.out.print(i.getNumber() + " ");
        }
    }
}
