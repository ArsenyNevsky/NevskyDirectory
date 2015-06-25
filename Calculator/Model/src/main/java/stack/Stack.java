package stack;

import java.util.ArrayList;

/**
 * Created by erafiil on 25.06.15.
 * This class is a wrapper for arraylist solving a problem with overriding methods.
 */
public class Stack<T> {

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(T element) {
        stack.add(element);
    }

    public T peek() {
        counter = stack.size();
        return stack.get(counter - 1);
    }

    public T pop() throws EmptyStackException {
        if (stack.isEmpty()) {
            throw new EmptyStackException("Stack is empty");
        }
        counter = stack.size();
        T element = stack.get(counter - 1);
        stack.remove(counter - 1);
        return element;
    }

    public boolean isEmptyStack() {
        return stack.isEmpty();
    }

    protected int counter;

    protected ArrayList<T> stack;
}
