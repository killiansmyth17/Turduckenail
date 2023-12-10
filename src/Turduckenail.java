import binarytree.BinaryTree;
import binarytree.Node;

// A class for the Turduckenail represented by a BinaryTree
public class Turduckenail {
    BinaryTree turduckenail;

    public Turduckenail(String value) {
        this.turduckenail = new BinaryTree(value);
    }

    // Returns a default Turduckenail
    public static Turduckenail getDefault() {
        return new Turduckenail("Tur")
                .addLayer("duck")
                .addLayer("en")
                .addLayer("ail");
    }

    // Add a new layer to the roast
    public Turduckenail addLayer(String value) {
        addLayerHelper(value, turduckenail.root());
        return this;
    }

    // Helper method for adding layer to the roast through recursion
    private void addLayerHelper(String value, Node current) {
        // BASE CASE: node doesn't have layer below, so add it
        if(!current.hasLeft()) {
            current.addLeft(value);
            current.addRight(value);
            return;
        }

        // if node does have layer below it, go to both children to continue search in each
        addLayerHelper(value, current.left());
        addLayerHelper(value, current.right());
    }

    @Override
    public String toString() {
        String[] layers = turduckenail.toString().split(", ");
        StringBuilder output = new StringBuilder();
        for(String layer: layers) {
            output.append(layer);
        }

        return output.toString();
    }
}
