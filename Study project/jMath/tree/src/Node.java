/**
 * Created with IntelliJ IDEA.
 * All rights reserved
 * User: ${Arseny_Nevsky}
 * Date: 29.09.13
 * Time: 23:48
 * Location: ${Russia_Saint-Petersburg}
 */
public class Node {


    public Node() {

    }


    public Node(int value) {
        this.value = value;
    }


    public void setNext(Node next) {
        this.next = next;
    }


    public void setValue(int value) {
        this.value = value;
    }


    public int getValue() {
        return value;
    }


    public Node getNext() {
        return next;
    }

    public boolean isEmptyNode() {
        return (next == null) ? true : false;
    }


    private Node next;
    private int value;
}
