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

    private String traversePerOder() {
        return "";
    }

    private String traverseInOder() {
        return "";
    }

    private String traversePosetOder() {
        return "";
    }
}
