/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw17.matrixlibraries;
import static ec.edu.espe.Matrix.BasicMATRIX.readMatrix;
import static ec.edu.espe.Matrix.BasicMATRIX.PrinMatrix;
import static ec.edu.espe.Matrix.BasicMATRIX.subtractionTwoMatrices;
import static ec.edu.espe.Matrix.BasicMATRIX.MultiplicationTwoMatrices;
import java.util.Scanner;


/**
 *
 * @author martin lema
 */
public class HW17MatrixLibraries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  System.out.println("==========================================================================================" + " \n"
                + "|Modular Calculator |" + "\n"
                + "======================= " + "\n"
                + "| student: Martín Lema | " + "\n"
                + "|University: University of the Armed Forces Espe | " + "\n"
                + "|career: geospatial engineering career | " + "\n"
                + "==================================================================================================");
        int COLUMNS;
        int ROWS;
        float[][] MATRIXA;
        float[][] MATRIXB;
        float[][] S;
        float[][] MATRIXC;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dimensions");
        System.out.print("\n columns----------------------------> ");
        ROWS = input.nextInt();

        System.out.print("\n rows--------------------------------------> ");
        COLUMNS = input.nextInt();

        MATRIXA = new float[ROWS][COLUMNS];
        MATRIXB = new float[ROWS][COLUMNS];
        MATRIXC = new float[ROWS][COLUMNS];
        S = new float[ROWS][COLUMNS];

     

        System.out.println("Enter the elements of the matrix--------------------------------> ");
        MATRIXA = readMatrix(ROWS, COLUMNS, "Matrix A", input);
        MATRIXB = readMatrix(ROWS, COLUMNS, "Matrix B", input);

        for (int TABLES = 0;TABLES<= ROWS / 2; TABLES++) {
            System.out.println("\t-------------------------------------->");
        }
        System.out.println(" Matrix A------------------------------->");

        PrinMatrix(ROWS, COLUMNS, MATRIXA);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        System.out.println("Matrix B---------------------------------------->");

        PrinMatrix(ROWS, COLUMNS, MATRIXB);
        System.out.println("------------------------------------------------->");

         System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
           
          System.out.println("======== The division of matriz ========");
        PrinMatrix(ROWS, COLUMNS,MATRIXC);
        MATRIXC =DivisionTwoMatrices(ROWS, COLUMNS, MATRIXA, MATRIXB);
        
        PrinMatrix(ROWS, COLUMNS, MATRIXC);
        PrinMatrix(ROWS, COLUMNS, MATRIXC);
        MATRIXC = MultiplicationTwoMatrices(ROWS, COLUMNS, MATRIXA, MATRIXB);

        PrinMatrix(ROWS, COLUMNS, MATRIXC);
        
        System.out.println("======== The multiplication   of matriz========");
        MATRIXC = MultiplicationTwoMatrices (ROWS, COLUMNS, MATRIXA, MATRIXB);

        PrinMatrix(ROWS, COLUMNS, MATRIXC);

        System.out.println("--------------------------------");
        System.out.println("======== The subtraction of matris========");
        MATRIXC = subtractionTwoMatrices(ROWS, COLUMNS, MATRIXA, MATRIXB);

        PrinMatrix(ROWS, COLUMNS, MATRIXC);

        System.out.println("------------------------------------------------->");
      
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
}