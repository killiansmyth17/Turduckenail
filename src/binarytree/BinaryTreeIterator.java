package binarytree;

public class BinaryTreeIterator {
    private Node root;
    private Node current;

    protected BinaryTreeIterator(BinaryTree tree) {
        this.root = tree.root();
        this.current = tree.root();
    }

    // navigate to child node on left
    public BinaryTreeIterator left() {
        if(!current.hasLeft()) {
            throw new IllegalStateException("Left Node is null");
        }

        current = current.left();
        return this;
    }

    // add left child node & navigate to it
    public BinaryTreeIterator left(String value) {
        this.addLeft(value);
        current = current.left();
        return this;
    }

    // navigate to child node on right
    public BinaryTreeIterator right() {
        if(!current.hasRight()) {
            throw new IllegalStateException("Right Node is null");
        }

        current = current.right();
        return this;
    }

    // add right child node & navigate to it
    public BinaryTreeIterator right(String value) {
        this.addRight(value);
        current = current.right();
        return this;
    }

    public BinaryTreeIterator parent() {
        if(current == root) {
            throw new IllegalStateException("Attempted to navigate to parent of root Node");
        }

        this.current = current.parent();
        return this;
    }

    public BinaryTreeIterator root() {
        this.current = this.root;
        return this;
    }

    // add left child node without navigating to it
    public BinaryTreeIterator addLeft(String value) {
        current.addLeft(value);
        return this;
    }

    // add right child node without navigating to it
    public BinaryTreeIterator addRight(String value) {
        current.addRight(value);
        return this;
    }

    public boolean hasLeft() {
        return current().hasLeft();
    }

    public boolean hasRight() {
        return current().hasRight();
    }

    public Node current() {
        return this.current;
    }
}
