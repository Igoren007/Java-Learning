package com.javastart.methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first;
        int second;
        int resultSum;

        System.out.println("number 1");
        first = input.nextInt();
        System.out.println("number 2");
        second = input.nextInt();

        resultSum = sum(first, second);
        System.out.println("Sum: " + resultSum);
    }

    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
