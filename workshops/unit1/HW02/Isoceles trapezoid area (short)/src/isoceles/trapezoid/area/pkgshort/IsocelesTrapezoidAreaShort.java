/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isoceles.trapezoid.area.pkgshort;

import java.util.Scanner;
/**
 *
 * @author martin lema
 */
public class IsocelesTrapezoidAreaShort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in = new Scanner(System.in);
     
       short lesserbase=0;
       short higherbase=0;
        short height=0;
        short divided=2;
       short area =0;
 System.out.println("enter the value of the lesserbase:");
         lesserbase=in.nextShort();
          System.out.println("enter the value of the higherbase -->");
        higherbase= in.nextShort();
        System.out.println("enter the value of the height -->");
        height=in.nextShort();
       area = (short) ((lesserbase+higherbase)*height/2);
        System.out.println("the area of the isosceles trapezoid is equal --> "+area);
    }
}


