/**
 * Created with IntelliJ IDEA.
 * All rights reserved
 * User: ${Arseny_Nevsky}
 * Date: 02.10.13
 * Time: 11:26
 * Location: ${Russia_Saint-Petersburg}
 */
class Node<T> {


    Node() {
        next = null;
    }

    Node(T value) {
        this.value = value;

    }


    Node(T value, Node next) {
        this.value = value;
        this.next = next;
    }


    void setValue(T value) {
        this.value = value;
    }


    void setNext(Node next) {
        this.next = next;
    }


    T getValue() {
        return value;
    }


    Node getNext() {
        return next;
    }

    private Node next;
    private T value;
}
