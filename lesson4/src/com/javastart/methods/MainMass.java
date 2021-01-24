package com.javastart.methods;

import java.util.Scanner;

public class MainMass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] mas = new int[5];

        for (int i = 0; i < 5; i++) {
            //int newElement = i + 1;
            //mas[i] = newElement;
            //System.out.println("element #" + i + " равен " + mas[i]);
            mas[i] = input.nextInt();
        }
        printMas(mas);
    }

    public static void printMas(int[] mas) {
    /*    for (int i = 0; i < mas.length; i++) {
            System.out.println("element #" + i + " равен " + mas[i]);
        }
     */
        for (int el : mas) {
            System.out.println(el);
        }
    }
}
