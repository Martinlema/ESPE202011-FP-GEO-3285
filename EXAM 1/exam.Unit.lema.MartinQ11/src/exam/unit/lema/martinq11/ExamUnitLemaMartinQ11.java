/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.unit.lema.martinq11;

import java.util.Scanner;

/**
 *
 * @author martin lema
 */
public class ExamUnitLemaMartinQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner  input =new Scanner (System.in);
        boolean mainloop =true;
        int option;
        
        
        do{
            System.out.println(" ========= Calculator =======");
            System.out.println("1. ->  table of multiplication ");
            System.out.println("2. -> exit   ");
            
            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {
              
            case 1:
               System.out.println("entera table");
        int stop=12;
          int product;
          int table;
          table=input.nextInt();
          System.out.println("table of multiplication:"+ table);
          for(int j=1 ;j < stop ;j++){
          product=table * j;
          System.out.println(+ table + " * " + j + " = "+product);
          product++;
          }
             case 0:
            System.out.println("Good Bye my friend");
            System.exit(0);
            break;
            
            }
    } while (option != 0); 
  }
}

            
          
          
        
        

 

