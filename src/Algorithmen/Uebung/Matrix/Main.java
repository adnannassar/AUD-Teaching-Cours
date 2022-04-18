package Algorithmen.Uebung.Matrix;

public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {10, 12, 11},
                {5, 7, 2},
                {2, 1, 0}};

        Matrix m = new Matrix(array);

        System.out.println("Original: ");
        System.out.println(m);

        m.transpose();

        System.out.println("Transpose");
        System.out.println(m);
    }
}
