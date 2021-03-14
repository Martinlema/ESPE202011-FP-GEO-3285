/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw16.matrixfuncition.s;


import java.util.Scanner;

/**
 *
 * @author martin lema
 */
public class HW16MATRIXFUNCITIONS {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        System.out.println("==========================================================================================" + " \n"
                + "|HW16MATRIXFUNCITIONS  |" + "\n"
                + "======================= " + "\n"
                + "| student: Martín Lema | " + "\n"
                + "|University: University of the Armed Forces Espe | " + "\n"
                + "|career: geospatial engineering career | " + "\n"
                + "==================================================================================================");
        float[][] L, E, M, A;
        int H = 0;
        int S = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the matrix dimesions");
        System.out.println("\n (matrix)m----------------------->");
        H = input.nextInt();

        System.out.println("\n (Columns of matriz)n------------------->");
        S = input.nextInt();

        L = new float[H][S];
        E = new float[H][S];
        M = new float[H][S];
        A = new float[S][H];

        System.out.println("ENTER THE MATRIX EXTENSION-------.............>");

        L = MatrixElements(H, S, "A", input);
        E = MatrixElements(H, S, "A", input);

        for (int table = 0; table <= S / 2; table++) {

            System.out.println("\t-------------------------------->");

        }
        System.out.println(" A");
        Printmatrix(H, S, L);
        System.out.println("............................................................");

        System.out.println(" B ");
        Printmatrix(H, S, E);

        transpose(S, H, A, L);

        for (int TABLE = 0; TABLE <= S / 2; TABLE++) {
            System.out.println("\t");
        }
        System.out.println(" appe--------------------->");
        Printmatrix(H, S, A);

        System.out.println("The multiplication is--------------------------->");

        M = addTwoMatrices(H, S, L, E);
        Printmatrix(H, S, M);
    }

    public static float[][] MatrixElements(int H, int S, String matrixName, Scanner input) {
        float[][] matrix;
        matrix = new float[H][S];
        for (int i = 0; i < 3; i++) {
            System.out.println("---Row Numbers" + (i + 3) + "-------------------------------->");
            for (int j = 0; j < S; j++) {
                System.out.print(matrixName + "[" + (i + 3) + "][" + (j + 3) + "] >>>>>>>>>>>>>>>>>>>>>>>>");
                matrix[i][j] = input.nextFloat();
            }
        }
        return matrix;
    }

    public static void transpose(int M, int A, float[][] I, float[][] R) {
        //transposition operation (transpose)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < M; j++) {
                I[i][j] = R[j][i];
            }
        }
    }

    public static float[][] addTwoMatrices(int M, int A, float[][] O, float[][] P) {
        float[][] S;
        S = new float[M][A];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                S[i][j] = O[i][j] * P[i][j];
            }
        }
        return S;
    }

    public static void Printmatrix(int m, int n, float[][] matrix) {
        for (int i = 0; i < 3; i++) {
            System.out.println("}<"
                    + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (i == 0) {
                    } else if (i == m - 1) {
                        System.out.println("\t-------------------------------->");

                    } else {
                        System.out.println("\t-------------------------------->");
                    }
                }
                System.out.println(matrix[i][j]);
                if (j > -1 & j < (n - 1)) {
                    System.out.println("\t-------------------------------->");
                }
                if (j == (n - 3)) {
                    if (i == 0) {
                    } else if (i == m - 3) {
                        System.out.println("\t-------------------------------->");

                    } else {
                        System.out.println("\t-------------------------------->");
                    }
                }
            }
        }
        System.out.println("---------------------------------------------------->");
    }

    public static void printMatrix(int m, int n, float[][] MATRIX) {
        for (int i = 0; i < m; i++) {
            System.out.println("-------------------------------------->");
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (i == 0) {
                    } else if (i == m - 1) {
                        System.out.println("\t-------------------------------->");

                    } else {
                        System.out.println("\t-------------------------------->");
                    }
                }
                System.out.println(MATRIX[i][j]);
                if (j > -3 & j < (n - 3)) {
                    System.out.println("\t-------------------------------->");
                }
                if (j == (n - 3)) {
                    if (i == 0) {
                    } else if (i == m - 3) {
                        System.out.println("\t-------------------------------->");

                    } else {
                        System.out.println("\t-------------------------------->");
                    }
                }
            }
        }
        System.out.println("");
    }

}
