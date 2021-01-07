/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

/**
 *
 * @author martin lema
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // varible declaration
        int sum;
        int addend1;
        int addend2;
        
        int minuend;
        int subtrahend;
        int diffrence;
        
        minuend = -23;
        subtrahend=-6;
        
 
        //-23 -(-6) = -23 +6 =-17
        
         int multiplying;
         int multiplier;
         int product;
         
        multiplying = 2;
        multiplier =5;
        
       int dividend;
        int divider;
         int quotient;
         
         dividend = 12;
         divider = 6;
         
         int quantily;
         int  base;
         int module;
         
         quantily =16;
         base=6;
         
       // initilization
        addend1 = 5;
        addend2 = 18;
       
        //operation
        sum= addend1  +  addend2;
        
        System.out.println("The addition of " + addend1 + " + " + addend2 +  " is equal to -->" + sum);
        
        ++sum;
        System.out.println("sum is equal to -->" +sum);
        
         sum++;
        System.out.println("sum is equal to -->" +sum);
       
       System.out.println("adding one to sum " + (++sum));
       
       System.out.println("ading one to sum " + ((++sum)));
       
       System.out.println("The subtraction of " + minuend + " - " + subtrahend +  " is equal to -->" + (minuend - subtrahend));
        
        System.out.println("The multiplication of " + multiplying + " * " + multiplier +  " is equal to -->" + (multiplying * multiplier));
        
         System.out.println("The division of " +   dividend + " / " + divider +  " is equal to -->" + (dividend / divider));
        
          System.out.println("The module of " + quantily  + " % " +     base +  " is equal to -->" + (  quantily % base ));
        
    }
}


