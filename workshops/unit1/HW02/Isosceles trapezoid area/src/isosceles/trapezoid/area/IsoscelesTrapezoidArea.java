/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isosceles.trapezoid.area;

import java.util.Scanner;

/**
 *
 * @author martin lema
 */
public class IsoscelesTrapezoidArea {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
         // varible declaration
         int area;
         int lesserbase;
        int  higherbase;
        int  height;
        int divided;
        
        lesserbase=15;
        higherbase=12;
        height=6;
        divided=2;
        
         //operation
        area = lesserbase  +  higherbase * height / divided ;
        
          System.out.println("The area of " + lesserbase + " + " + higherbase + " * " +height+  "/"  + divided +" is equal to -->" + (lesserbase+ higherbase* height /divided));
       
	 }
}

    

