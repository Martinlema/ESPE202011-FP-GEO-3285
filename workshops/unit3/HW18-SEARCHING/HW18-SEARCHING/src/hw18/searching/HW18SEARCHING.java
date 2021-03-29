/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18.searching;
import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;
import hw18.searching.LinearSearch;
import hw18.searching.numbers;
import java.io.PrintStream;

import java.util.Scanner;

/**
 *
 * @author martin lema
 */
public class HW18SEARCHING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         System.out.println("******************************* " + " \n"
                + "|  HW18SEARCHING |" + "\n"
                + "******************************************* " + "\n"
                + "| student:Martín Lema | " + "\n"
                + "| University of the Armed Forces Espe | " + "\n"
                + "| geospatial engineering career | " + "\n"
                + "*******************************************");
        Scanner input =new Scanner (System.in);
        // search on the line
         int[] integersnumbersToSearch = {3,5,4,7,8,9,4,5,6
                                       ,2,12,14,17,18,19,20,21,
                                       22,25,26,78,98,54,63,26,
                                       98};
        printArray.print(integersnumbersToSearch);
        System.out.println("------------------------------------------>");
        System.out.println("ENTER THE NUMBER--------------------->");
        int x = input.nextInt();
        LinearSearch.search(integersnumbersToSearch, x);
        System.out.println("the position the number is --> " + LinearSearch.search(integersnumbersToSearch, x));
        System.out.println("---------------------------------------------->");

        // LOOKUP IN THE AGES OF BINARY NUMBERS
       System.out.println ("lookup in the ages of  numbers");
        System.out.println ("list of ages");
        int []integersToSearch = {5,6,2,3,4,7,8,9,10,11
                                ,12,13,14,15,15,17,18,19,
                                20,24,34,36, 35,67,89,98,55,
                                78,50};
        System.out.println("----------------------------------------------->");
        System.out.println("ENTER THE NUMBER");
        int y = input.nextInt();
        BinarySearch.search(integersToSearch, y, y, y);
        System.out.println("");
        System.out.println("THE AGE POSITION IS --> " + BinarySearch.search(integersToSearch, y, y, y));

    }
}
