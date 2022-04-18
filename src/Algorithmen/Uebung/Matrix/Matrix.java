package Algorithmen.Uebung.Matrix;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private int[][] data;

    public Matrix() {
    }
    public Matrix(int[][] array) {
        this.data = new int[array.length][array[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = array[i][j];
            }
        }
    }
    public Matrix(int anzZeilen, int anzSpalten) {
        assert (anzZeilen > 0);
        assert (anzSpalten > 0);
        data = new int[anzZeilen][anzSpalten];
        fill();
    }

    private void fill() {
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = random.nextInt(50);
            }
        }
    }
    public void transpose() {
        int [][] newMatrix = new int[data[0].length][data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                newMatrix[i][j] = data[j][i];
            }
        }
        data = newMatrix;
    }


    @Override
    public String toString() {
        String ausgabe = "";
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                ausgabe += data[i][j] + "\t";
            }
            ausgabe += "\n";
        }
        return ausgabe;
    }
}
