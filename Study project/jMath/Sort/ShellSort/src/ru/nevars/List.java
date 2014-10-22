package ru.nevars;

public class List {

    public void add(int value) {
        if (head == null) {
            head = new Node();
            head.value = value;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node newNode = new Node();
            newNode.previous = temp;
            newNode.value = value;
            temp.next = newNode;
        }
    }

    public void printListLeftToRight() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }

    public void printListRightToLeft() {
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }

        while (node != null) {
            System.out.print(node.value + " ");
            node = node.previous;
        }
    }

    private Node head;

    private class Node {
        private int value;
        private Node previous;
        private Node next;
    }
}
