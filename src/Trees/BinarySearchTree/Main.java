package Trees.BinarySearchTree;


public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        tree.add(60);
        tree.add(40);
        tree.add(50);
        tree.add(30);
        tree.add(35);
        tree.add(48);
        tree.add(70);

        System.out.println("Preorder:             " + tree.traversePerOder());
        System.out.println("Postorder:            " + tree.traversePostOder());
        System.out.println("Inorder:              " + tree.traverseInOder());
        System.out.println("Inorder Inverted:     " + tree.traverseInOderInverted());
        System.out.println("Postorder Inverted:   " + tree.traversePostOderInverted());

        System.out.println(tree.search(35) ? "35 Gefunden!" : "35 nicht gefunden!");
        System.out.println(tree.search(36) ? "36 Gefunden!" : "36 nicht gefunden!");

        System.out.println("Anzahl Knoten:  " + tree.anzahlKnoten());
        System.out.println("Anzahl Blätter: " + tree.anzahlBlätter());
        System.out.println("Hohe des Baums: " + tree.hohe());

        BaumInfo info = tree.getBaumInfo();
        System.out.println("Baum Info: \nHöhe: " + info.höhe + "\nAnzahl Knoten: " +
                info.anzKnoten + "\nAnzahl Blätter: " + info.anzBlätter);
    }
}
