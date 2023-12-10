package binarytree;

// BinaryTree class handles tree structure logic as a whole
public class BinaryTree {
    private Node root;

    // Create tree without initial value
    public BinaryTree() {
        this.root = Node.createRoot();
    }

    // Create tree with initial value
    public BinaryTree(String value) {
        this.root = Node.createRoot(value);
    }

    // TODO: implement a use-case for this somewhere
    private void setRoot(Node root) {
        if(root.parent() != null) {
            throw new IllegalArgumentException("New root has a non-null parent");
        }
        this.root = root;
    }

    public Node root() {
        return this.root;
    }

    public BinaryTreeIterator iterator() {
        return new BinaryTreeIterator(this);
    }

    // TODO: Implement BinaryTree toString method that iterates through the entire tree and returns it as a String
    // Traverse & print whole BinaryTree
    @Override
    public String toString() {
        return this.toStringHelper(this.root());
    }

    // Helper function for toString method to iterate through BinaryTree recursively
    private String toStringHelper(Node current) {
        if(current == null) {
            return "";
        }

        StringBuilder output = new StringBuilder(current.toString());

        if(current.hasLeft()) {
            output.append(", ").append(toStringHelper(current.left()));
        }

        if(current.hasRight()) {
            output.append(", ").append(toStringHelper(current.right()));
        }

        return output.toString();
    }
}

