import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * All rights reserved
 * User: ${Arseny_Nevsky}
 * Date: 02.10.13
 * Time: 11:30
 * Location: ${Russia_Saint-Petersburg}
 */
public class List<T> implements Iterable<T> {


    public List() {

    }


    public List(T value) {
        head = new Node(value);
    }


    public void print() {
        while (head != null) {
            System.out.print(head.getValue() + " ");
            head = head.getNext();
        }
    }


    public void add(T element) {
        if (head == null) {
            head = new Node(element);
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            Node newNode = new Node(element);
            temp.setNext(newNode);
        }
    }


    public Object getHead() {
        return head.getValue();
    }


    public Node getNext() {
        return head.getNext();
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }


    private class ListIterator implements Iterator {

        @Override
        public boolean hasNext() {
            return head != null;
        }

        @Override
        public T next() {
            T item = (T) head.getValue();
            head = head.getNext();
            return item;
        }

        @Override
        public void remove() {
            //Чуть позже
        }

        private List list;
    }

    private Node head;
}
