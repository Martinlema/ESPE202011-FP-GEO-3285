/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wso8debugging;

import java.util.Scanner;

/**
 *
 * @author martin lema
 */
public class WSO8DeBugging {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
        int multiplicand = 0;
        int multiplier = 1;
        int product;
        int stop = 12;

        do {
            product = 0;
            System.out.println("");

            do {
                System.out.println("Enter the table you want to study ");
                System.out.println(" 0 (zero) to exit  --> ");

                Scanner input = new Scanner(System.in);
                multiplicand = input.nextInt();

                if (multiplicand != 0) {
                    System.out.println("Studying the Table of ----> " + multiplicand + " <----");
                    for (multiplier = 1; multiplier <= stop; multiplier++) {
                        product = multiplicand * multiplier;

                        System.out.println(multiplicand + " * " + multiplier + " = " + product);
                    }
                }
                multiplier = 1;

            } while (multiplicand != 0);
        } while (multiplicand != 0);

        System.out.println("See you later classmates from the programming class");

    }
}
