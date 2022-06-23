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
}
