/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws16bidimensionalarrays;

/**
 *
 * @author martin lema
 */
public class WS16BidimensionalArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          System.out.println("==========================================================================================" + " \n"
                + "|ws16bidimensionalarrays |" + "\n"
                + "======================= " + "\n"
                + "| student: Martín Lema | " + "\n"
                + "|University: University of the Armed Forces Espe | " + "\n"
                + "|career: geospatial engineering career | " + "\n"
                + "==================================================================================================");
        int a[][] = {{10, 14, 18}, {9, 5, 8}, {6, 4, 8}};
        int b[][] = {{16, 6, 10}, {-10, 4, -6}, {9, 10, 24}};

        //    10    14    18           16    6    10       26    20    28
        //    9     5      8     +    -10     4    -6   =   -1    9     2
        //    6     4      8           9    10    24       15    14    32
        int c[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("The additon of matrix A -> ");

        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.print("\t " + c[i][j]);
            }
        }
        System.out.println("\nAnd Matrix B -> ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t " + c[i][j]);
            }
        }

        System.out.println("\nequals to -> ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t " + c[i][j]);
            }
        }

    }

}
