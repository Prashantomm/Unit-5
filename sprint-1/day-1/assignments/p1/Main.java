package com.masai.p1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter Your Choice:");
            System.out.println("1. Push Element:");
            System.out.println("2. Pop Element:");
            System.out.println("3. Peek Element:");
            System.out.println("4. Check if Stack is Empty");
            System.out.println("5. Show Stack");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int element = sc.nextInt();
                    stack.push(element);
                    System.out.println("Element pushed  in to the stack:"+element);
                    break;
                case 2:
                    try {
                        int poppedElement = stack.pop();
                        System.out.println("Popped element: " + poppedElement);
                    } catch (IllegalStateException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        int topElement = stack.peek();
                        System.out.println("Top element of Stack: " + topElement);
                    } catch (IllegalStateException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    boolean isEmpty = stack.isEmpty();
                    System.out.println("Stack is empty: " + isEmpty);
                    break;
                case 5:
                    stack.show();
                    break;
                case 6:
                    System.out.println("Thank You so much visit again...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
            System.out.println();
        } while (choice != 6);

        sc.close();
    }

}
