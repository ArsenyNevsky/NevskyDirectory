package stack;

import java.util.ArrayList;

/**
 * Created by erafiil on 25.06.15.
 * This class is a wrapper for arraylist solving a problem with overriding methods.
 */
public class Stack<T> {

    public void push(T element) {
        counter++;
        stack.add(element);
    }

    public T peek() {
        return stack.get(counter);
    }

    public T pop() throws EmptyStackException {
        if (counter == 0) {
            throw new EmptyStackException("Stack is empty");
        }
        T element = stack.get(counter);
        stack.remove(counter--);
        return element;
    }

    public boolean isEmptyStack() {
        return counter == 0 ? true : false;
    }

    protected int counter;

    protected ArrayList<T> stack;
}
