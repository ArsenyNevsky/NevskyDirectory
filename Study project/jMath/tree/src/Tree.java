import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * All rights reserved
 * User: ${Arseny_Nevsky}
 * Date: 30.09.13
 * Time: 0:09
 * Location: ${Russia_Saint-Petersburg}
 */
public class Tree implements Iterable {

    public Tree(int value) {
        root = new NodeTree(value);
    }


    public Tree() {
        root = null;
    }


    public void add(int value) {
        add(value, root);
    }


    private void add(int value, NodeTree nodeTree) {
        if (nodeTree == null) {
            nodeTree = new NodeTree(value);
            root = nodeTree;
        } else {
            NodeTree head = nodeTree;
            while (true) {
                if (head.getValue() < value) {
                    if (head.getLeft() != null) {
                        head = head.getLeft();
                    } else {
                        NodeTree temp = new NodeTree(value);
                        head.setLeft(temp);
                        break;
                    }
                } else {
                    if (head.getRight() != null) {
                        head = head.getRight();
                    } else {
                        NodeTree temp = new NodeTree(value);
                        head.setRight(temp);
                        break;
                    }
                }
            }
        }
    }


    public void printTree() {
        printTree(root);
    }


    @Override
    public TreeIterator iterator() {
        return new TreeIterator();
    }


    private class TreeIterator implements Iterator {

        private TreeIterator() {
            list = new List();
            addToList();
            iterator = list.iterator();
        }

        protected void addToList() {
            addToList(root);
        }

        private void addToList(NodeTree node) {
            if (node != null) {
                list.addValue(node.getValue());
                addToList(node.getLeft());
                addToList(node.getRight());
            }
        }

        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        @Override
        public Object next() {
            return iterator.next();
        }

        @Override
        public void remove() {

        }

        private List list;
        private Iterator iterator;
    }


    private void printTree(NodeTree node) {
        if (node != null) {
            System.out.print(node.getValue() + " ");
            printTree(node.getLeft());
            printTree(node.getRight());
        }
    }


    private NodeTree root;
}
