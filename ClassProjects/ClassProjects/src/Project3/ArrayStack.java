package Project3;

public class ArrayStack<T> implements Stack<T> {

    private static final int INITIAL_CAPACITY = 10;
    private T[] data;
    private int top;

    // Constructor
    public ArrayStack() {
        data = (T[]) new Object[INITIAL_CAPACITY];
        top = -1;
    }

    @Override
    public void push(T item) throws IllegalStateException {
        if (top == data.length - 1) {
            throw new IllegalStateException("Stack is full. Cannot add more items.");
        }
        data[++top] = item;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T result = data[top];
        data[top] = null; // Clear the data
        top--;
        return result;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return data[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int length() {
        return top + 1;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i <= top; i++) {
            result.append(data[i]);
            if (i < top) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
