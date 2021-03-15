/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Matrix;
import java.util.Scanner;
/**
 *
 * @author martin lema
 */
public class BasicMATRIX {
  

    public static float[][] readMatrix(int COLUMNS, int ROWS, String matrixName, Scanner input) {
        float[][] matrix;
        matrix = new float[COLUMNS][ROWS];
        for (int i = 0; i < COLUMNS; i++) {
            System.out.println("---ROW Numbers " + (i + 1) + "---");
            for (int j = 0; j < ROWS; j++) {
                System.out.print(matrixName + "[" + (i + 1) + "] [" + (j + 1) + "] -> ");
                matrix[i][j] = input.nextFloat();
            }
        }
        return matrix;
    }

      public static float[][] subtractionTwoMatrices(int COLUMNS, int ROWS, float[][] MATRIXA, float[][] MATRIXB) {
        float[][] matrixC;
        matrixC = new float[COLUMNS][ROWS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                matrixC[i][j] = MATRIXA[i][j]-MATRIXB[i][j];
            }
        }
        return matrixC;

    }
    private static float[][]DivisionTwoMatrices(int ROWS, int COLUMNS, float[][] MATRIXA, float[][] MATRIXB) {
        float[][] matrixC;
        matrixC = new float[COLUMNS][ROWS];
        for (int i = 0; i < COLUMNS; i++) {
            for (int j = 0; j < ROWS; j++) {
                matrixC[i][j] = MATRIXA[i][j]/MATRIXB[i][j];
            }
        }
        return matrixC;
    }
    public static float[][] MultiplicationTwoMatrices(int COLUMNS, int ROWS, float[][] MATRIXA, float[][] MATRIXB) {
        float[][] matrixc;
        matrixc = new float[COLUMNS][ROWS];
        for (int i = 0; i < COLUMNS; i++) {
            for (int j = 0; j < ROWS; j++) {
                matrixc[i][j] = MATRIXA[i][j]*MATRIXB[i][j];
            }
        }
        return matrixc;
    }

    public static void PrinMatrix(int COLUMNS, int ROWS, float[][] matrix) {
        for (int i = 0; i < COLUMNS; i++) {
            System.out.println("");
            for (int j = 0; j < ROWS; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.print("\t");
                    } else if (i == COLUMNS - 1) {
                        System.out.print("\t");
                    } else {
                        System.out.print("\t");
                    }
                }
                System.out.print(matrix[i][j]);
                if (j > -1 && j < (ROWS - 1)) {
                    System.out.print("\t");
                }
                if (j == (ROWS - 1)) {
                    if (i == 0) {
                        System.out.print("\t");
                    } else if (i == COLUMNS - 1) {
                        System.out.print("\t");
                    } else {
                        System.out.print(" \t");
                    }
                }
            }
        }
        System.out.print("------------------------------------------------------");
    }

}
