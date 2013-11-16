import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * All rights reserved
 * User: ${Arseny_Nevsky}
 * Date: 09.10.13
 * Time: 23:23
 * Location: ${Russia_Saint-Petersburg}
 */
public class Stack<T> {


    public Stack() {
        stack = new ArrayList<>();
    }


    public void push(T element) {
        stack.add(element);
    }


    public T pop() {
        T element = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return element;
    }


    public T peek() {
        T element = stack.get(stack.size() - 1);
        return element;
    }


    public void printStack() {
        for (T element : stack) {
            System.out.print(element + " ");
        }
        System.out.println();
    }


    public boolean isEmpty() {
        return stack.isEmpty();
    }


    private ArrayList<T> stack;
}
