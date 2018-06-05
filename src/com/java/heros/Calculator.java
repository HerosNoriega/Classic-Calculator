package com.java.heros;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Operation operation = new Operation();

        System.out.print("Enter first number: ");
        int number_1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int number_2 = scan.nextInt();
        int resultAdd = operation.addition(number_1, number_2);
        int resultSub = operation.subtraction(number_1, number_2);
        int resultMult = operation.multiplication(number_1, number_2);
        int resultDiv = operation.division(number_1, number_2);

        System.out.println("The result of Addition: " + resultAdd);
        System.out.println("The result of Subtraction: " + resultSub);
        System.out.println("The result of Multiplication: " + resultMult);
        System.out.println("The result of Division: " + resultDiv);

    }
}