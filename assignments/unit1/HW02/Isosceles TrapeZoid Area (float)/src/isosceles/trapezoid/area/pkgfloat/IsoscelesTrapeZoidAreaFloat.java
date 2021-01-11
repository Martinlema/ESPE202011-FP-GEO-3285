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
     
       float lesserbase =15.2588F;
        float higherbase =12.255F;
        float height= 06.9855F;
        float divided = 2;
        float area = 0;
System.out.println("The area of " + lesserbase + " + " + higherbase + " * " +height+  "/"  + divided +" is equal to -->" + (lesserbase+ higherbase* height /divided));
       
    }
}



        
       
     
     
    