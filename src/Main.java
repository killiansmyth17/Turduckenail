import binarytree.*;

public class Main {
    public static void main(String[] args) {
        // cursed fuckin way to manually create a tree that I wrote on paper for testing lmao
        BinaryTree tree = new BinaryTree("1");
        tree.iterator().left("2").left("4").addRight("7")
                .parent().right("5").left("8").addLeft("12")
                .parent().addRight("9")
                .root().right("3").right("6").left("10").right("13").addRight("15")
                .parent().parent().right("11").right("14").addLeft("16");

        System.out.println(tree);
    }
}
