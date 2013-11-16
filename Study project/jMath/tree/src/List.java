import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * All rights reserved
 * User: ${Arseny_Nevsky}
 * Date: 29.09.13
 * Time: 23:52
 * Location: ${Russia_Saint-Petersburg}
 */
public class List implements Iterable {


    public List() {
        node = new Node();
    }


    public List(int value) {
        node = new Node(value);
    }


    public void addValue(int value) {
        if (node == null) {
            node = new Node(value);
        } else {
            Node temp = node;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            Node item = new Node(value);
            temp.setNext(item);
        }
    }


    public void printValue() {
        while (node != null) {
            System.out.print(node.getValue() + " ");
            node = node.getNext();
        }
    }

    @Override
    public Iterator iterator() {
        return new ListIterator();
    }

    private Node node;


    private class ListIterator implements Iterator {

        public ListIterator() {
            head = node;
        }

        @Override
        public boolean hasNext() {
            return head.getNext() != null;
        }

        @Override
        public Object next() {
            head = head.getNext();
            return head.getValue();
        }

        @Override
        public void remove() {

        }

        private Node head;
    }

}
