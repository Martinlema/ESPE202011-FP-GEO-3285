/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw07.iterations;

import java.util.Scanner;

/**
 *
 * @author martin lema
 */
public class HW07Iterations {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        i = 0;

        System.out.println("==== This is a while loop from 1 to 24 ====");

        while (i < 24) {
            System.out.println("i -> " + (i + 1));
           
            i++;
    }
    System.out.println("Multiplication Tables : 24");
        int top=12;
        int product=0;
        int table = 23;
        for (int j = 1 ; j <= top ; j++){
            product = table * j;
            System.out.println("23 * " + j + " = " + product);
        }
    System.out.println("the cost of my car");
        i=1;
        int month=5300;
        int capital= 600;
        double intereses=50;
         double debt;

        for (int j = 1 ; j <= month ; j++){
            product = table * j;
             debt = j * intereses * capital;
            System.out.println("the value is " + j + "purchases" + debt);
        }
    }
}

             
    

