package Project3;

import java.util.Scanner;

public class StackUserInterface {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Stack<Integer> stack = new ArrayStack<>();

            while (true) {
                System.out.println("\n--- Stack Operations ---");
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Peek");
                System.out.println("4. Check if Empty");
                System.out.println("5. Get Length");
                System.out.println("6. Print Stack");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1: // Push
                        System.out.print("Enter a number to push: ");
                        int item = scanner.nextInt();
                        try {
                            stack.push(item);
                            System.out.println("Item pushed.");
                        } catch (IllegalStateException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 2: // pop
                        Integer popped = stack.pop();
                        if (popped == null) {
                            System.out.println("Stack is empty.");
                        } else {
                            System.out.println("Popped: " + popped);
                        }
                        break;
                    case 3: // peek
                        Integer peeked = stack.peek();
                        if (peeked == null) {
                            System.out.println("Stack is empty.");
                        } else {
                            System.out.println("Top of stack: " + peeked);
                        }
                        break;
                    case 4: // is empty
                        System.out.println("Is stack empty? " + stack.isEmpty());
                        break;
                    case 5: // length
                        System.out.println("Length of stack: " + stack.length());
                        break;
                    case 6: // print stack
                        System.out.println("Stack: " + stack);
                        break;
                    case 7: // Exit
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1-7.");
                }
            }
        }
    }