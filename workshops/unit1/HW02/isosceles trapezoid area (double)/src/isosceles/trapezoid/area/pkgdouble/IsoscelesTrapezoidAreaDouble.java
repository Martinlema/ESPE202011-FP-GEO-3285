/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isosceles.trapezoid.area.pkgdouble;


import java.util.Scanner;

/**
 *
 * @author martin lema
 */
public class IsoscelesTrapezoidAreaDouble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner in = new Scanner (System.in);
       double lesserbase=0;
       double higherbase=0;
       double height=0;
       double area=0;
      
        
       System.out.println("enter the value of the lesserbase -->");
         lesserbase=in.nextDouble();
          System.out.println("enter the value of the higherbase -->");
        higherbase= in.nextDouble();
        System.out.println("enter the value of the height -->");
        height=in.nextDouble();
        area=((lesserbase+higherbase)*height/2);
        System.out.println("the area of the isosceles trapezoid is equal " +area);
       
	 }
}        

