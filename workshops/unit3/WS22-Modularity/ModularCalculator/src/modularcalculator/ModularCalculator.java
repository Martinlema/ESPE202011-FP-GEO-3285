/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularcalculator;

import java.util.Scanner;
import utils.BasicOperation;

/**
 *
 * @author martin lema
 */
public class ModularCalculator {

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
        float operand1;
        float operand2;
        float result;

        Scanner input = new Scanner(System.in);

 
        System.out.println("------ENTER TWO NUMBERS------->");
        System.out.println("------FIRST NUMBER------->");
        operand1 = input.nextFloat();
        System.out.println("------SECOND  NUMBER------->");
        operand2 = input.nextFloat();

        System.out.println("------ADDITION------->");
        result = BasicOperation.addTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " + " + operand2 + " = " + result);

        System.out.println("------subtraction------->");
        result = BasicOperation.subtractTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " - " + operand2 + " = " + result);
        
        System.out.println("------multiplication------->");
        result = BasicOperation.multiplicationTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " * " + operand2 + " = " + result);
        
         System.out.println("------ division------->");
        result = BasicOperation. divisionTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " / " + operand2 + " = " + result);


    }

}
