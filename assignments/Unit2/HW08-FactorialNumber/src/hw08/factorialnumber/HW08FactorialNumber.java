/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw08.factorialnumber;

import java.util.Scanner;

/**
 *
 * @author martin lema
 */
public class HW08FactorialNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner option = new Scanner(System.in);
        int number;
        long factor = 1;
        int stop = 15;
        System.out.println("please enter a number");
        number = option.nextInt();
        for (int j = number; j > 1; j--) {
            factor *= j;
        }
        System.out.println("The factorial of " + number +  " is: " + factor);
    }
}

