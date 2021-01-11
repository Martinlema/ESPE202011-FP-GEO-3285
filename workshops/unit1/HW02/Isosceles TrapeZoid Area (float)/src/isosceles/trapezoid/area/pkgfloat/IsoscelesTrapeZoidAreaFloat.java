/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isosceles.trapezoid.area.pkgfloat;

import java.util.Scanner;
/**
 *
 * @author martin lema
 */
public class IsoscelesTrapeZoidAreaFloat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Scanner in = new Scanner(System.in);
     
       float lesserbase =0;
        float higherbase =0;
        float height= 0;
        float divided = 2;
        float area = 0;
System.out.println("enter the value of the lesserbase:");
         lesserbase=in.nextFloat();
          System.out.println("enter the value of the higherbase -->");
        higherbase= in.nextFloat();
        System.out.println("enter the value of the height -->");
        height=in.nextFloat();
       area = (short) ((lesserbase+higherbase)*height/2);
        System.out.println("the area of the isosceles trapezoid is equal --> "+area);
       
    }
}



        
       
     
     
    