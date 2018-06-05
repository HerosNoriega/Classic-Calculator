package com.java.heros;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Operation operation = new Operation();

        System.out.print("Enter first number: ");
        float number_1 = scan.nextFloat();
        System.out.print("Enter second number: ");
        float number_2 = scan.nextFloat();
        float resultAdd = operation.addition(number_1, number_2);
        float resultSub = operation.subtraction(number_1, number_2);
        float resultMul = operation.multiplication(number_1, number_2);
        float resultDiv = operation.division(number_1, number_2);

        System.out.println("The result of Addition: " + resultAdd);
        System.out.println("The result of Subtraction: " + resultSub);
        System.out.println("The result of Multiplication: " + resultMul);
        System.out.println("The result of Division: " + resultDiv);

    }
}