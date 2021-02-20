/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12.foreign.currency.outflow.tax;

import java.util.Scanner;

/**
 *
 * @author martin lema
 */
public class Hw12ForeignCurrencyOutflowTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("================== " + " \n"
                + "| Foreign Currency Out flow Tax |" + "\n"
                + "======================= " + "\n"
                + "| student Martín Lema | " + "\n"
                + "| University of the Armed Forces Espe | " + "\n"
                + "| geospatial engineering career | " + "\n"
                + "===================================");
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option = 0;
                
        while (option > 2) {
            System.out.println("");
        }
        do {

            System.out.println("1.----> Credit or debit cards in person ");
            System.out.println("2.---->THROUGH A WEBSITE ");
            System.out.println("0.----> Exit");
            System.out.println("Enter your menu option-->");
            option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Enter the Amount of money");

                    float AmountOfMoney = input.nextFloat();
                    float Tax = PrintTaxPercentage(AmountOfMoney);
                    ;

                    System.out.println("the value of the tax is " + Tax + "%");
                    break;

                case 2:
                    System.out.println ("Enter the amount of money");
                    float AmountOfMoney2 = input.nextFloat();
                    float Tax2 = PrintTaxPercentage2(AmountOfMoney2);

                    System.out.println("the value of your tax is" + Tax2 + "%");
                    break;

                case 0:
                    System.out.println("thanks for using our program see you later");
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid option\n\n");
                    break;

            }
        } while (option != 5);

    }

  //=====================================================================================
//=====================================================================================
    public static float PrintTaxPercentage(float AmountOfMoney) {
        float Tax = 0.0F;
        float Value = 0.000F;

        if (AmountOfMoney > 5000.0) {
            Tax = 5;
            Value = (float) (AmountOfMoney * 0.05);
        } else {
            Tax = 0;
            Value = AmountOfMoney;
        }
        System.out.println("");
        System.out.println("The value is " + Value + " since ");
        return Tax;

    }
//=====================================================================================
 //=====================================================================================
    public static float PrintTaxPercentage2(float AmountOfMoney2) {
        float Tax2 = 0.0F;
        float Value2 = 0.000F;

        if (AmountOfMoney2 > 100.0) {
            Tax2 = 5;
            Value2 = (float) (AmountOfMoney2 * 0.05);
        } else {
            Tax2 = 0;
            Value2 = AmountOfMoney2;
        }
        System.out.println("");
        System.out.println("The value is " + Value2 + " since ");
        return Tax2;
    }
}
