package ru.nevars;

public class Stack {

    public void push(int value) {
        if (head == null) {
            head = new Node();
            head.value = value;
        } else {
            Node tail = head;
            Node newHead = new Node();
            newHead.value = value;
            newHead.next = tail;
            head = newHead;
        }
    }

    public void printStack() {
        Node h = head;
        while (h != null) {
            System.out.print(h.value + " ");
            h = h.next;
        }
    }

    private Node head;

    private class Node {
        private int value;
        private Node next;
    }
}
