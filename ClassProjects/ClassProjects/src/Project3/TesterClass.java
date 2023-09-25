package Project3;

public class TesterClass {

        public static void main(String[] args) {
            Stack<Integer> stack = new ArrayStack<>();

            // testing push and toString
            stack.push(1);
            stack.push(2);
            stack.push(3);
            System.out.println("Stack after pushes: " + stack); // Expected: [1, 2, 3]

            // Test peek
            System.out.println("Peek: " + stack.peek()); // Expected: 3

            // Test pop
            System.out.println("Pop: " + stack.pop()); // Expected: 3
            System.out.println("Stack after pop: " + stack); // Expected: [1, 2]

            // Test isEmpty and length
            System.out.println("Is Stack empty? " + stack.isEmpty()); // Expected: false
            System.out.println("Stack length: " + stack.length()); // Expected: 2

            // Empty the stack
            stack.pop();
            stack.pop();
            System.out.println("Stack after emptying: " + stack); // Expected: []

            // Test empty stack
            System.out.println("Is Stack empty? " + stack.isEmpty()); // Expected: true
            System.out.println("Peek on empty stack: " + stack.peek()); // Expected: null
            System.out.println("Pop on empty stack: " + stack.pop()); // Expected: null
        }


}
