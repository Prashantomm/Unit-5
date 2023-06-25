package com.masai.p4;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Calculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter the operation (+, -, *, /): ");
            String operation = scanner.next();

            BinaryOperator<Double> calculator;

            switch (operation) {
                case "+":
                    calculator = (a, b) -> a + b;
                    break;
                case "-":
                    calculator = (a, b) -> a - b;
                    break;
                case "*":
                    calculator = (a, b) -> a * b;
                    break;
                case "/":
                    calculator = (a, b) -> {
                        if (b == 0) {
                            throw new ArithmeticException("Division by zero is not allowed.");
                        }
                        return a / b;
                    };
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operation. Please try again.");
            }

            double result = calculator.apply(num1, num2);
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

}
