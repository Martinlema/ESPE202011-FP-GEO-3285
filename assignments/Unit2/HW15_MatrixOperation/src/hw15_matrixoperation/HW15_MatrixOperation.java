/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15_matrixoperation;

/**
 *
 * @author martin lema
 */
public class HW15_MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==========================================================================================" + " \n"
                + "|Matrix Operation |" + "\n"
                + "======================= " + "\n"
                + "| student: Martín Lema | " + "\n"
                + "|University: University of the Armed Forces Espe | " + "\n"
                + "|career: geospatial engineering career | " + "\n"
                + "==================================================================================================");

        int a[][] = {{7, 4, 8}, {7, 5, 3}, {6, 4, 8}};
        int b[][] = {{1, 6, 0}, {-1, 4, -3}, {9, 1, 4}};

        //    7       4         8           1     6         0             7    2 4        0
        //    7       5         3     *    -1     4        -3    =      -7     20        -9
        //    6      4          8           9     1        4            54      4         32
        int c[][] = new int[3][3];

        for (int e = 0; e < 3; e++) {
            for (int g = 0; g < 3; g++) {
                c[e][g] = a[e][g] * b[e][g];
            }
        }

        System.out.println("The multiplication of matrix A --------------------> ");

        for (int e = 0; e < 3; e++) {
            System.out.println("");
            for (int g = 0; g < 3; g++) {
                System.out.print("\t " + c[e][g]);
            }
        }

        System.out.println("\n And Matrix B ------------------------------> ");
        for (int e = 0; e < 3; e++) {
            System.out.println("");
            for (int g = 0; g < 3; g++) {
                System.out.print("\t " + c[e][g]);
            }
        }

        System.out.println("\n the result is -------------------------> ");
        for (int e = 0; e < 3; e++) {
            System.out.println("");
            for (int g = 0; g < 3; g++) {
                System.out.print("\t " + c[e][g]);
            }
        }

    }
}
