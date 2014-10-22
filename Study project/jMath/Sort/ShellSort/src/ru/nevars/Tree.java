package ru.nevars;

public class Tree {

    public Tree() {
        root = null;
    }

    public void add(int value) {
        add(root, value);
    }

    public void remove(int value) {
        remove(root, value);
    }

    public void print() {
        print(root);
    }

    public void checkElement(int value) {
        checkElement(root, value);
    }

    private void print(Node tree) {
        if (tree != null) {
            System.out.print(tree.value + " ");
            print(tree.left);
            print(tree.right);
        }
    }

    private void add(Node tree, int value) {
        if (tree == null) {
            tree = new Node();
            tree.value = value;
            tree.parent = tree;
            root = tree;
        } else {
            Node tempTree = tree;
            while (true) {
                if (value < tempTree.value) {
                    if (tempTree.left != null) {
                        tempTree = tempTree.left;
                    } else {
                        Node newLeft = new Node();
                        newLeft.value = value;
                        newLeft.parent = tempTree;
                        tempTree.left = newLeft;
                        break;
                    }
                } else {
                    if (tempTree.right != null) {
                        tempTree = tempTree.right;
                    } else {
                        Node newRight = new Node();
                        newRight.value = value;
                        newRight.parent = tempTree;
                        tempTree.right = newRight;
                        break;
                    }
                }
            }
        }
    }

    private void checkElement(Node tree, int element) {
        if (tree == null) {
            System.out.println("The tree is empty");
            return;
        } else {
            Node tempTree = tree;
            while (true) {
                if (tempTree == null) {
                    System.out.println("No");
                    break;
                }
                if (element < tempTree.value) {
                    tempTree = tempTree.left;
                } else if (element > tempTree.value) {
                    tempTree = tempTree.right;
                } else if (element == tempTree.value) {
                    System.out.println("\nYes. Its parent is = " + tempTree.parent.value);
                    break;
                }
            }
        }
    }

    private void remove(Node tree, int value) {
        if (tree == null) {
            throw new NullPointerException("\nThe tree is empty");
        } else {
            Node t = tree;
            while (true) {
                if (value < t.value) {
                    t = t.left;
                } else if (value > t.value) {
                    t = t.right;
                } else if (value == t.value) {
                    if (t.left == null && t.right == null) {
                        t = new Node();
                        break;
                    }
                }
            }
        }
    }

    private void NCA(int v1, int v2) {

    }

    private Node root;

    private class Node {
        private int value;
        private Node left;
        private Node right;
        private Node parent;
    }
}
