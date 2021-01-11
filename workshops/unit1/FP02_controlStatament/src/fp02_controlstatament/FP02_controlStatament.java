/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp02_controlstatament;

import java.util.Scanner;

/**
 *
 * @author martin lema
 */
public class FP02_controlStatament {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Please enter a integer-->");
     int num;
     num=scanner.nextInt();
	
	if (num%2==0){
       System.out.println("The number entered is even --> " + num);
	 }else{
     System.out.println("The number entered is odd -->"+ num);
	   }
	 }
 }
	
    
    
