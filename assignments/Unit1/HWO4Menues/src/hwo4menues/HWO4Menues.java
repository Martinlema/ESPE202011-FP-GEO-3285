/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwo4menues;

import java.util.Scanner;

/**
 *
 * @author martin lema
 */
public class HWO4Menues {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        System.out.println(" ========= Calculator =======");
        System.out.println("1.->  area del triangulo  ");
        System.out.println("2.-> multiplication table  ");
        System.out.println("3.-> multiplication table ");
        System.out.println("4.-> Exit");

        System.out.println("Enter your menu option --> ");
        option = input.nextInt();

        switch (option) {

            case 1:
                int base;
                int height;
                int divided = 2;
                int area;
                System.out.println("enter base ->");
                base = input.nextInt();
                System.out.println("enter height  -> ");
                height = input.nextInt();
                area = base * height / divided;
                System.out.println("The area is " + base + " * " + height + "/" + divided + " is equal to -->" + (base * height / divided));
                break;
            case 2:
                System.out.println("multiplication 6  ");
                int multiplyng = 0;
                int multiplier = 6;
                int multiplication;
                System.out.println("enter multiplyng ->");
                multiplyng = input.nextInt();
                System.out.println("enter multiplier  -> ");
                multiplier = input.nextInt();
                multiplication = multiplyng * multiplier;
                System.out.println("The multiplication is " + multiplication);
                break;
            case 3:
                System.out.println("multiplication table  ");
                int stop = 12;
                int product = 0;
                int table;
                System.out.println("table de multiplication " + "multiplication");
                table = input.nextInt();
                System.out.println("table de multiplication " + table);
                for (int j = 1; j < stop; j++) {
                    product = table * j;
                    System.out.println(+table + "* " + j + " = " + product);
                    break;
                        case 4: 
                    System.out.println("Good Bye my friend");
                    System.exit(4);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 4);

    }

}
