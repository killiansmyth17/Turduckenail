package binarytree;

// Node class handles tree structure logic from a single Node's perspective
public class Node {
    private String value;
    private Node left;
    private Node right;
    private Node parent;

    // Create a Node with no value. Should only be used for creating an initial root binarytree.Node,
    // as creating a Node without having a value to store is pointless
    private Node() {

    }

    // Create a node
    private Node(String value, Node parent) {
        this.setValue(value);
        this.setParent(parent);
    }

    // Create an  initial root Node without a value. Should only be called if no root exists
    protected static Node createRoot() {
        return new Node();
    }

    // Create an initial root Node with a value. Should only be called if no root exists
    protected static Node createRoot(String value) {
        return new Node(value, null);
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    private void setParent(Node parent) {
        this.parent = parent;
    }

    // Set a node's parent, should only be done when creating a child node or moving a node elsewhere in the tree
    public Node parent() {
        return this.parent;
    }

    // add child node to left
    public void addLeft(String value) {
        // Current node cannot have child if it has no value
        if (this.getValue() == null) {
            throw new IllegalStateException("Cannot add child to a Node with no value");
        }

        if(value == null) {
            throw new IllegalArgumentException("Cannot create a Node with a null value");
        }

        this.left = new Node(value, this);
    }

    // get node on left
    public Node left() {
        return this.left;
    }

    // Returns true if Node has child on left
    public boolean hasLeft() {
        return this.left != null;
    }

    // add child node to right
    public void addRight(String value) {
        // Current node cannot have child if it has no value
        if (this.getValue() == null) {
            throw new IllegalStateException("Cannot add child to a Node with no value");
        }

        if(value == null) {
            throw new IllegalArgumentException("Cannot create a Node with a null value");
        }

        this.right = new Node(value, this);
    }

    // get node on right
    public Node right() {
        return this.right;
    }

    // Returns true if Node has child on right
    public boolean hasRight() {
        return this.right != null;
    }

    @Override
    public String toString() {
        return this.getValue();
    }
}
