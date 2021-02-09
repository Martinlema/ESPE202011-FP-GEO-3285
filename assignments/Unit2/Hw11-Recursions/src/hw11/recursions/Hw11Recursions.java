/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11.recursions;

import java.util.Scanner;

/**
 *
 * @author martin lema
 */
public class Hw11Recursions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==========================================================================================" + " \n"
                + "| Recursions |" + "\n"
                + "======================= " + "\n"
                + "| student Martín Lema | " + "\n"
                + "| University of the Armed Forces Espe | " + "\n"
                + "| geospatial engineering career | " + "\n"
                + "==================================================================================================");
        Scanner input = new Scanner(System.in);

        System.out.println("enter the value of the number you want");
        int Number = input.nextInt();

        System.out.println("**************please enter the power value for its respective calculation*********************.."
                + "");
        int Potencial = input.nextInt ();

        int Result ;

        Result =  PrintSquare( Number , Potencial);
        System.out.println("the result of the factorial number would bef "
                +  ""  + Number  +  ""
                +  " is -----> "  +  Result ) ;
 
    }

    private static int PrintSquare(int number, int Potencial) {

        if ( Potencial  ==  0) {
            return 1;

        } else {
            return (number * PrintSquare ( number , Potencial  - 1 ));

        }

    }
}
