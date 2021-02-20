/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12.value.added.tax;

import java.util.Scanner;

/**
 *
 * @author martin lema
 */
public class HW12ValueAddedTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==========================================================================================" + " \n"
                + "| Value Added Tax |" + "\n"
                + "======================= " + "\n"
                + "| student: Martín Lema | " + "\n"
                + "|University: University of the Armed Forces Espe | " + "\n"
                + "|career: geospatial engineering career | " + "\n"
                + "==================================================================================================");
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option = 0;
        while (option > 2) {
            System.out.println("");
        }
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("Hello prestigious user wants to know what the value added tax is "
                    + "of a product or service, the first thing you can  consult"
                    + "where you can review Goods and services taxed with a "
                    + "0% IVA rate.\n"
                    + "Otherwise choose option 2 to exit. ");
            System.out.println("---------------------------------------------");
            System.out.println("1.----> Know the IVA value to pay of a "
                    + "good or service ");
            System.out.println("2.----> Exit ");

            System.out.println("");
            System.out.println("Enter your menu option-->");
            option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Please enter the product value");

                    float ValueProdcut = input.nextFloat();
                    float ValueIVA = PrintValueTax(ValueProdcut);
                    ;

                    System.out.println("The IVA is " + ValueIVA);
                    break;

                case 2:
                    System.out.println("Thank you very much for using our programs until next time");
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid option\n\n");
                    break;

            }
        } while (option != 2);

    }
//------------------------------------------------------------------------------

    public static float PrintValueTax(float ValueProdcut) {
        float ValueIVA;

        ValueIVA = (float) (ValueProdcut * 0.12);

        return (float) ValueIVA;

    }
}
