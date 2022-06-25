package Trees.BinarySearchTree;

public class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> root;

    public Node<T> getRoot() {
        return root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    private void attach(Node<T> newNode) {
        root = newNode;
    }

    public void add(T value) {
        if (isEmpty()) {
            attach(new Node<>(value, null, null));
        } else {
            add(value, root);
        }
    }

    private void add(T value, Node<T> newRoot) {
        int compareResult = value.compareTo(newRoot.value);
        if (compareResult == 0) {
            return;
        }
        if (compareResult > 0) {
            if (newRoot.right == null) {
                newRoot.right = new Node<>(value, null, null);
            } else {
                add(value, newRoot.right);
            }
        } else {
            if (newRoot.left == null) {
                newRoot.left = new Node<>(value, null, null);
            } else {
                add(value, newRoot.left);
            }
        }
    }

    public String traversePerOder() {
        if (isEmpty()) {
            return "Baum ist leer!";
        } else {
            return traversePerOder(root);
        }
    }

    private String traversePerOder(Node<T> newRoot) {
        String erg = "";

        // Root
        erg += newRoot.value + " ";

        // Left
        if (newRoot.left != null) {
            erg += traversePerOder(newRoot.left);
        }

        // Right
        if (newRoot.right != null) {
            erg += traversePerOder(newRoot.right);
        }

        return erg;
    }

    public String traverseInOder() {
        if (isEmpty()) {
            return "Baum ist leer!";
        } else {
            return traverseInOder(root);
        }
    }

    private String traverseInOder(Node<T> newRoot) {
        String erg = "";

        // Left
        if (newRoot.left != null) {
            erg += traverseInOder(newRoot.left);
        }

        // Root
        erg += newRoot.value + " ";

        // Right
        if (newRoot.right != null) {
            erg += traverseInOder(newRoot.right);
        }

        return erg;
    }

    public String traversePostOder() {
        if (isEmpty()) {
            return "Baum ist leer!";
        } else {
            return traversePostOder(root);
        }
    }

    private String traversePostOder(Node<T> newRoot) {
        String erg = "";

        // Left
        if (newRoot.left != null) {
            erg += traversePostOder(newRoot.left);
        }

        // Right
        if (newRoot.right != null) {
            erg += traversePostOder(newRoot.right);
        }

        // Root
        erg += newRoot.value + " ";

        return erg;
    }

    public String traversePostOderInverted() {
        if (isEmpty()) {
            return "Baum ist leer!";
        } else {
            return traversePostOderInverted(root);
        }
    }

    private String traversePostOderInverted(Node<T> newRoot) {
        String erg = "";


        // Right
        if (newRoot.right != null) {
            erg += traversePostOderInverted(newRoot.right);
        }

        // Left
        if (newRoot.left != null) {
            erg += traversePostOderInverted(newRoot.left);
        }


        // Root
        erg += newRoot.value + " ";

        return erg;
    }

    public String traverseInOderInverted() {
        if (isEmpty()) {
            return "Baum ist leer!";
        } else {
            return traverseInOderInverted(root);
        }
    }

    private String traverseInOderInverted(Node<T> newRoot) {
        String erg = "";


        // Right
        if (newRoot.right != null) {
            erg += traverseInOderInverted(newRoot.right);
        }

        // Root
        erg += newRoot.value + " ";

        // Left
        if (newRoot.left != null) {
            erg += traverseInOderInverted(newRoot.left);
        }

        return erg;
    }

    public boolean search(T value) {
        if (isEmpty()) {
            return false;
        } else {
            return search(value, root);
        }
    }

    private boolean search(T value, Node<T> newRoot) {
        if (newRoot == null) {
            return false;
        }

        int compareResult = value.compareTo(newRoot.value);
        if (compareResult == 0) {
            return true;
        } else if (compareResult > 0) {
            return search(value, newRoot.right);
        } else {
            return search(value, newRoot.left);
        }
    }

    public int anzahlKnoten() {
        if (isEmpty()) {
            return 0;
        } else {
            return anzahlKnoten(root);
        }
    }

    private int anzahlKnoten(Node<T> newRoot) {
        if (newRoot == null) {
            return 0;
        } else {
            return anzahlKnoten(newRoot.left) + anzahlKnoten(newRoot.right) + 1;
        }
    }

    public int anzahlBlätter() {
        if (isEmpty()) {
            return 0;
        } else {
            return anzahlBlätter(root);
        }
    }

    public int anzahlBlätter(Node<T> newRoot) {
        // Abbruch Bedingung
        if (newRoot == null) {
            return 0;
        }
        if (newRoot.left == null && newRoot.right == null) {
            return 1;
        } else {
            return anzahlBlätter(newRoot.left) + anzahlBlätter(newRoot.right);
        }
    }

    public int hohe() {
        if (isEmpty()) {
            return 0;
        } else {
            return hohe(root);
        }
    }

    private int hohe(Node<T> newRoot) {
        if (newRoot == null) {
            return 0;
        } else {
            int hoheLeft = hohe(newRoot.left);
            int hoheRight = hohe(newRoot.right);
            if (hoheLeft > hoheRight) {
                return hoheLeft + 1;
            } else if (hoheRight > hoheLeft) {
                return hoheRight + 1;
            } else {
                return hoheRight + 1;
            }
        }
    }

    public BaumInfo getBaumInfo() {
        if (isEmpty()) {
            return new BaumInfo();
        } else {
            return new BaumInfo(anzahlKnoten(), anzahlBlätter(), hohe());
        }
    }
}
