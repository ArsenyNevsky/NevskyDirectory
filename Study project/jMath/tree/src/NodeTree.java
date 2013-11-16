/**
 * Created with IntelliJ IDEA.
 * All rights reserved
 * User: ${Arseny_Nevsky}
 * Date: 30.09.13
 * Time: 0:15
 * Location: ${Russia_Saint-Petersburg}
 */
public class NodeTree {


    public NodeTree() {
        left = null;
        right = null;
    }


    public NodeTree(int value) {
        this.value = value;
        left = null;
        right = null;
    }


    public NodeTree getLeft() {
        return left;
    }


    public NodeTree getRight() {
        return right;
    }


    public int getValue() {
        return value;
    }


    public void setLeft(NodeTree left) {
        this.left = left;
    }


    public void setRight(NodeTree right) {
        this.right = right;
    }


    public void setValue(int value) {
        this.value = value;
    }


    private int value;
    private NodeTree left;
    private NodeTree right;
}
